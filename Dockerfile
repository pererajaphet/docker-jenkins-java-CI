# Étape 1 : Build avec Gradle
FROM gradle:8.7.0-jdk17 AS builder

WORKDIR /app

# Copier les fichiers de configuration
COPY build.gradle.kts ./
COPY gradle ./gradle

# Précharger les dépendances
RUN gradle dependencies --no-daemon

# Copier le reste des sources
COPY src ./src

# Compiler le projet
RUN gradle build --no-daemon

# Étape 2 : Image légère pour l'exécution
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copier le JAR généré
COPY --from=builder /app/build/libs/*.jar app.jar

# Exécuter le programme principal
CMD ["java", "-jar", "app.jar"]
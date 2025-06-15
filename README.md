# 📦 Simple calculatrice Java avec Gradle, Docker et Jenkins

Projet Java simple (addition/soustraction) utilisant **Gradle**, testé avec **JUnit 5 + AssertJ**, exécuté dans **Docker**, et automatisé via **Jenkins**.

## 🚀 Structure
- `src/main/java` : code source (Addition, Soustraction, Main)
- `src/test/java` : tests unitaires
- `build.gradle.kts` : dépendances (JUnit, AssertJ)
- `Dockerfile` : build et exécution de l’app
- `Jenkinsfile` : pipeline CI/CD

## ⚙️ Build & Exécution

### En local
```bash
./gradlew build
./gradlew test
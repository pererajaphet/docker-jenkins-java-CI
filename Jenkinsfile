pipeline{
    agent any
    environment {
            IMAGE_NAME = "mon-app-java"
        }
    stages{
        stage("Build docker's image"){
            steps{
                sh 'docker build -t $IMAGE_NAME .'
            }
        }
        stage("Build docker's image"){
            sh 'docker run --rm $IMAGE_NAME'
        }
    }
}
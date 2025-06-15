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
        stage("Run Docker container"){
            steps{
                sh 'docker run --rm $IMAGE_NAME'
            }
        }
    }
}
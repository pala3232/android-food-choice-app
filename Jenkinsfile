pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git url: 'https://github.com/pala3232/android-food-choice-app.git', branch: 'main', credentialsId: 'bb1b2520-6ba8-4688-a27e-2ffdd748edd7'
            }
        }
        stage('Build, Test and Run Docker Image') {
            steps {
                sh 'docker build -t android-food-choice-app -f Dockerfile .'
                sh 'docker run --rm android-food-choice-app'
                sh 'docker run --rm android-food-choice-app echo Docker image works!'
            }
        }
    }
}

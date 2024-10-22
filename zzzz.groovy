pipeline {
    agent any
    stages {
        stage('Building') {
            steps {
                echo 'Building stage Running...'
            }
        }
        stage('Testing') {
            steps {
                echo 'Testing Stage Running...'
            }
        }
        stage('Deploying') {
            steps {
                echo 'Deploying Stage Running...'
            }
        }
    }
}


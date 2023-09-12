pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'javac DivideNumbers.java'
            }
        }
        stage('Test') {
            steps {
                bat 'java DivideNumbers'
            }
        }
    }

    post {
        success {
            echo 'Build and test successful!'
        }
        failure {
            echo 'Build or test failed!'
        }
    }
}

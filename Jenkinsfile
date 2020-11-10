pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
            	chmod +x gradlew
                sh './gradlew assemble'
            }
        }
        stage('Test') {
            steps {
            	chmod +x gradlew
                sh './gradlew test'
            }
        }
    }
}
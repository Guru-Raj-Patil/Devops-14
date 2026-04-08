pipeline {
    agent any

    tools {
        jdk 'jdk21'
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Guru-Raj-Patil/Devops-14.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/site/jacoco/**', fingerprint: true
        }
    }
}

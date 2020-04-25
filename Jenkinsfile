pipeline {
    agent none 
    stages {
        stage('Example Test') {
            agent {
                label 'docker'
                docker 'openjdk:8-jre'
            } 
            steps {
                echo 'Hello, JDK'
                sh 'java -version'
            }
        }
    }
}

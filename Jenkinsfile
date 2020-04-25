pipeline {
    agent {
        label 'docker'
    }
    stages {
        stage('Example Test') {
            agent {
                docker {
                    label 'docker'
                    image 'openjdk:8-jre'
                }
            } 
            steps {
                echo 'Hello, JDK'
                sh 'java -version'
            }
        }
    }
}

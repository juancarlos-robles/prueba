pipeline {
    agent {
        label 'principal'
    }
    stages {
        stage('Example Test') {
            steps {
                echo 'Hello, JDK'
                sh 'java -version'
            }
        }
    }
}

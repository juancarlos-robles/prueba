pipeline {
    agent any

    stages {  
        stage ("build") {
            tools {
               jdk "JDK 11"
            }
            steps {
                sh 'java -version'
                sh 'javac jenkins/src/jenkins/Saludo.java jenkins/src/jenkins/main.java'
                sh 'java -cp jenkins/src/ jenkins.main'
            }
        }
   }
    post {
        always {
            junit '**/test-reports/*.xml'
        }
    }
}

pipeline {
    agent any

    stages {  
        stage ("build") {
            tools {
               jdk "JDK 11"
            }
            steps {
                sh 'java -version'
                sh 'javac jenkins/src'
                sh 'java -cp jenkins/src/ jenkins.main'
            }
        }          
   }
}

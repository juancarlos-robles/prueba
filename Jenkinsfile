pipeline {
    agent any

    stages {  
        stage ("build") {
            tools {
               jdk "JDK 11"
            }
            steps {
                sh 'java -version'
                sh 'javac jenkins/src/jenkins/main.java'
                sh 'java -cp jenkins/src/ jenkins.main'
                javadoc 'jenkins/src/jenkins/main.java'
            }
        }          
   }
}

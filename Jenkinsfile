pipeline {
    agent any

    stages {  
        stage ("build") {
            tools {
               jdk "JDK 11"
            }
            steps {
                sh 'java -version'
                sh 'javac -sourcepath jenkins/src/jenkins/Saludo.java'
                sh 'javac -sourcepath jenkins/src/jenkins/main.java'
                sh 'java -cp jenkins/src/ jenkins.main'
            }
        }          
   }
}

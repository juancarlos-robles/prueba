pipeline {
    agent any

    stages {  
        stage ("build") {
            tools {
               jdk "JDK 11"
            }
            steps {
                sh 'java -version'
                sh 'javac -sourcepath src /src/jenkins/Saludo.java'
                sh 'javac -sourcepath src /src/jenkins/main.java'
                sh 'java -cp jenkins/src/ jenkins.main'
            }
        }          
   }
}

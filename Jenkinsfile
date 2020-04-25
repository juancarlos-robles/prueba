pipeline {
    agent any

    stages {  
        stage ("build") {
            tools {
               jdk "JDK 11"
            }
            steps {
                sh 'javadoc'
                sh 'java -version'
            }
        }          
   }
}

pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               echo 'Compilando el proyecto'
               sh 'javac jenkins/src/jenkins/main.java'
            }
        }
        stage('Execute') { 
            steps { 
               echo 'Ejecutando el proyecto'
               sh 'java jenkins/src/jenkins/main'
            }
        }
    }
}

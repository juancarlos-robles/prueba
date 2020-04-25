pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               echo 'Compilando el proyecto'
               $JAVA_HOME jenkins/src/jenkins/main.java
            }
        }
        stage('Execute') { 
            steps { 
               echo 'Ejecutando el proyecto'
               java jenkins/src/jenkins/main
            }
        }
    }
}

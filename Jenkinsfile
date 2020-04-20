pipeline {
   agent any
   tools {
      maven 'Maven'
   }
   stages {
       stage("Build") {
                steps {
                    snDevOpsStep ()
                    echo "Building" 
                    sh 'mvn -X clean install -DskipTests'
                    sleep 5
                }
       }
        stage("Test") {
           steps {
               snDevOpsStep ()
               echo "Testing"
               sh 'mvn test'
               sleep 15
           }
          post {
                always {
                    junit '**/target/surefire-reports/*.xml' 
                }
          }
        }
  
      stage("Deploy") {
             steps{
                  snDevOpsStep ()
                  echo ">> Deploy in prod"
                  snDevOpsChange()              
              }
      }      
      
  }
}

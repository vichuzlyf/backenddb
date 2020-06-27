pipeline {
   agent any

   options {
        timestamps()
    }

   stages {
		stage('Checkout') {
            steps {
                checkout scm
            }
        }
      stage('Build') {
         steps {
            sh "mvn -Dmaven.test.failure.ignore=true clean package"
         }

         post {.
            success {
               junit '**/target/surefire-reports/TEST-*.xml'
               archiveArtifacts 'target/*.jar'
            }
         }
      }
   }
}

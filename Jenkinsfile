pipeline {
   agent any

   options {
        timestamps()
    }
	
	tools {
      jdk "Java8"
   }

   stages {
		stage('Checkout') {
            steps {
                checkout scm
            }
        }
      stage('Build') {
         steps {
            sh("mvn -Dmaven.test.failure.ignore=true clean package")
         }

         post {
            success {
               junit '**/target/surefire-reports/TEST-*.xml'
            }
         }
      }
   }
}

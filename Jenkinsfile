pipeline {
   agent any
	
	tools {
      jdk "Java8"
   }

   options(){
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

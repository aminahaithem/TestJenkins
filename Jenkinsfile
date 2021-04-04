pipeline {
    agent { dockerfile true }
    stages {
        stage('Build') {
            steps {
                 sh "java -version"
   		         sh "mvn -version"
		         sh "mvn clean install"
            }
        }
    }
}
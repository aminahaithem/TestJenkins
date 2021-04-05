pipeline {
   agent {
	     label "master"
         dockerfile true		 
  }
    stages {
        stage("build") {
            steps {
			    sh "docker build -t TestJenkins ."
            }
        }
    }
}
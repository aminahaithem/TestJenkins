pipeline {
   agent {
     dockerfile {
	     filename "Dockerfile"
	     label "master"       
  }
                  
 }
    stages {
        stage("build") {
            steps {
			    sh "docker build -t TestJenkins ."
            }
        }
    }
}
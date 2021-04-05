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
			    echo "docker build -t TestJenkins ."
            }
        }
    }
}
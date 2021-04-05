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
			   sh "java -version"
			   echo "docker build -t TestJenkins ."
            }
        }
    }
}
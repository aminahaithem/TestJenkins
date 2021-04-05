pipeline {
   agent {
    dockerfile {
       dockerfile true
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
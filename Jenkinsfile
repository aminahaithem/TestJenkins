pipeline {
   agent {
    dockerfile {
        filename 'Dockerfile'
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
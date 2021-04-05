pipeline {
    agent { docker{ image "java:8"} }
    stages {
        stage("build") {
            steps {
			   sh "java -version"
			   echo "docker build -t TestJenkins ."
            }
        }
    }
}
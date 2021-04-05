pipeline {
    agent any
    stages {
        stage("build") {
            steps {
			   sh "java -version"
			   sh "docker build -t TestJenkins ."
            }
        }
    }
}
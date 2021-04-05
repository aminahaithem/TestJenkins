pipeline {
    agent any
    stages {
        stage("build") {
            steps {
			java -version
			   sh "docker build -t TestJenkins ."
            }
        }
    }
}
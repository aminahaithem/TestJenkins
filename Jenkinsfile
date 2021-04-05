pipeline {
    agent {label "TestJenkins"}
    stages {
        stage("build") {
            steps {
			   sh "java -version"
			   sh "docker build -t TestJenkins ."
            }
        }
    }
}
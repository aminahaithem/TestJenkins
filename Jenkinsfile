pipeline {
 agent {
    dockerfile {
        filename "Dockerfile"
		PATH= "$PATH=./devops/"
		label 'master'
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
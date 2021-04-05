pipeline {
 agent {
    dockerfile {
        filename "./Dockerfile"
		ls "Dockerfile"
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
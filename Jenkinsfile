pipeline {
 agent {
    dockerfile {
        filename "/devops/Dockerfile"
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
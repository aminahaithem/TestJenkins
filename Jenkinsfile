pipeline {
 agent {
    dockerfile {
        filename "Dockerfile"
		dir "build"
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
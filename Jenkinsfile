pipeline {
 agent {
    dockerfile {
        filename "./Dockerfile"
		sh "cd /src"
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
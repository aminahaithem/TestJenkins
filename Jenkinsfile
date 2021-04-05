pipeline {
 agent {
    docker {
        dockerfile true
        label 'docker'
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
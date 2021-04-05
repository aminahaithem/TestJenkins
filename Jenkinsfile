pipeline {
 agent {
    docker {
        dockerfile true
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
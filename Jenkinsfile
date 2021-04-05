pipeline {
   agent {
    dockerfile {
        filename 'Dockerfile'
        dir 'build'
        label 'TestJenkins'
        registryUrl 'https://github.com/aminahaithem/TestJenkins'
        registryCredentialsId 'aminahaithem'
    }
    stages {
        stage("build") {
            steps {
			   sh "java -version"
			   echo "docker build -t TestJenkins ."
            }
        }
    }
}
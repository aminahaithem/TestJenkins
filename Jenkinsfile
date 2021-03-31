pipeline
{
  agent {
    docker {
	image "maven:3.6.0-jdk-8"
	label "docker"
     }
  }
  stages{
     stage("Bulid"){
      steps {
        sh "mvn -version"
        sh "mvn clean install"
      } 
    }
  }
      post {
     always { 
            cleanWs()
        }
    }
}
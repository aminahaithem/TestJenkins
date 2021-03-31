pipeline
{ 
 agent {
        docker {
            image "maven:3.0.6-jdk-8-alpine"
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
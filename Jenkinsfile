pipeline
{
 agent {
        docker {
            image "maven:Maven_Home"
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
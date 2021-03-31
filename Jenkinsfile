pipeline
{
 agent {
        docker {
            image "maven:Maven_Home-jdk-8"
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
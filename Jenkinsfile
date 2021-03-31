pipeline
{
  agent any
  tools{
  maven "Maven_Home"
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
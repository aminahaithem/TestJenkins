pipeline
{
  agent any
  stages{
     stage("Bulid"){
      steps {
        sh "mvn -version"
        sh "mvn clean install"
      } 
    }
  }
  
  post{
    always{
    
    cleanWs()
    }
    
  }
}
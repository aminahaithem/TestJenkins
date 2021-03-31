pipeline
{
  agent any
  tools{
  maven "3.6.0"
  }
  stages{
     stage("Bulid"){
      steps {
        sh "mvn -version"
        sh "mvn clean install"
      } 
    }
  }
 
}
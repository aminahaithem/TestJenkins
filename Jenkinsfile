pipeline{ 
  agent none
stages{
     stage("Bulid"){
	 agent { docker "openjdk:8"}
      steps {
        sh "java -version"
		sh "mvn -version"
		sh "mvn clean install"
      } 
    }
  }
}
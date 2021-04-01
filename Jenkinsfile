pipeline{ 
  agent none
stages{
     stage("Bulid"){
	 agent { docker "maven:3.6.0-jdk-8"}
      steps {
        sh "java -version"
		sh "mvn -version"
		sh "mvn clean install"
      } 
    }
  }
}
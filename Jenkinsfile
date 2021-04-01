pipeline{ 
  agent none
stages{
     stage("Bulid"){
	 agent { docker "maven:3.6.0-jdk-8-alpine"}
      steps {
	   git "https://github.com/aminahaithem/TestJenkins.git"
        sh "java -version"
		sh "mvn -version"
		cleanWs()
		sh "mvn clean install"
      } 
    }
  }
}
pipeline{ 
  agent none
stages{
     stage("Bulid"){
	 agent { docker "maven:3-adoptopenjdk-8"}
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
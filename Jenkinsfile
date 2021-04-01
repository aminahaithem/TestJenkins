pipeline{ 
  agent none
stages{
     stage("Bulid"){
	 
	 agent {
    git "https://github.com/aminahaithem/TestJenkins.git"	 
	 docker "maven:3.6.0-jdk-8-alpine"
	 }
      steps {
	   
        sh "java -version"
		sh "mvn -version"
		cleanWs()
		sh "mvn clean install"
      } 
    }
  }
}
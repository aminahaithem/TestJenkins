pipeline{ 
  agent any
stages{
     stage("Bulid"){
	  steps {
	     sh "java -version"
   		 sh "export MAVEN_HOME=/opt/maven"
         sh "export PATH=$PATH:$MAVEN_HOME/bin"
         sh "mvn --version"
		 sh "mvn clean install"
      } 
    }
	 stage("test"){
      steps {
	    sh "mvn test"
	  }	
	}
	 stage("dockerImage")
	{
	  steps{
        sh "docker build -f Dockerfile -t TestJenkins"
        sh "docker run -p 8086:8086 TestJenkins"	   
	}
	}
	
  }
}
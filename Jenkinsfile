pipeline{ 
  agent any
stages{
     stage("Bulid"){
	  steps {
	     sh "java -version"
   		 cleanWs()
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
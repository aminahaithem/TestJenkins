pipeline{ 
  agent any
stages{
     stage("Bulid"){
	  steps {
	     sh "export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64"
         sh "export PATH=$PATH:$JAVA_HOME/bin"
	     sh "java -version"
   		 sh "export MAVEN_HOME=/usr/share/maven"
         sh "export PATH=$PATH:$MAVEN_HOME/bin"
		 sh "/usr/share/maven/bin/mvn -v"
         sh "mvn -version"
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
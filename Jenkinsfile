pipeline {
 agent any
 //{
    //dockerfile {
        //filename "Dockerfile"
	//	label "master"
    //}
//}
    stages {
	    stage("Git"){
		  steps{
		    git "https://github.com/aminahaithem/TestJenkins.git"
		  }
		}
		 stage("Install maven"){
		    steps{
			  echo "Installation mvn"
			  sh "mvn clean install package"
			}
		 }
		 stage("Test"){
		    steps{
			  echo "Test"
			  sh "mvn test"
			
			}
		 }
		 
        stage("build Image") {
            steps {
			    sh "docker build -f  Dockerfile -t testjenkins ."
				sh "docker images"
            }
        }
		
		stage("Run image"){
		    steps{

			    sh "docker run -p 8080:8080 -d testjenkins"
			}
		}
		stage("Execut docker"){
		    steps{

			    sh "docker exec -it testjenkins bash"
			}
		}
		
    }
	
}
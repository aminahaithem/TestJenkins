pipeline
{
    agent any
    stages {
        stage("Git")
        {
            steps{
              git "https://github.com/aminahaithem/TestJenkins.git"  
            }
           
        }
        stage("compile")
        {
            steps{
                sh "mvn clean compile"
            }
        }
        stage("test")
        {
            steps{
                sh "mvn test"
            }
        }
        stage("install")
        {
            steps{
                sh "mvn clean install package"
            }
        }
        stage("Build docker")
        {
            steps{
                sh "docker build -f Dockerfile -t testjenkins ."
            }
        }
        stage("run docker")
        {
            steps{
                sh "docker run -p 8080:8080 -d testjenkins"
            }
            post{
                success{
                    archiveArtifacts "target/*.war"
                }
            }
           
        }
       
    }
   
}
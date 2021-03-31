pipeline
{
 environment{
    JAVA_TOOL_OPTIONS="-Duesr.home=/var/maven"
 }
 agent {
        docker {
            image "maven:3.0.6-jdk8"
             label "dockerBuild"
			 args "-v /tmp/maven:/var/maven/.m2 -e MAVEN_CONFIG=/var/maven/.m2"
        }
  }
  stages{
     stage("Bulid"){
      steps {
        sh "mvn -version"
        sh "mvn clean install"
      } 
    }
  }
      post {
     always { 
            cleanWs()
        }
    }
}
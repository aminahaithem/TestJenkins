pipeline {
 agent any
 //{
    //dockerfile {
        //filename "Dockerfile"
	//	label "master"
    //}
//}
    stages {
        stage("build") {
            steps {
			    sh "docker build -f  Dockerfile -t TestJenkins ."
            }
        }
    }
}
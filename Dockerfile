FROM openjdk:8
EXPOSE 8088
ADD target/testJenkins.war testJenkins.war
ENTRYPOINT ["java","-war","/testJenkins.war"]
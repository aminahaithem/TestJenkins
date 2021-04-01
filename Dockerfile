FROM openjdk:8
EXPOSE 8088
ADD target/testJenkins-testJenkins.jar testJenkins-testJenkins.war
ENTRYPOINT ["java","-jar","/testJenkins-testJenkins.jar"]
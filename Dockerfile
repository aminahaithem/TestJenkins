FROM adoptopenjdk:8-jdk-hotspot
ADD target/TestJenkins-TestJenkins.war TestJenkins-TestJenkins.war
EXPOSE 8086
ENTRYPOINT ["java","-war","/testjenkins.war"]

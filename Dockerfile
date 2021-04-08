FROM openjdk:8
EXPOSE 8086
ADD target/TestJenkins.jar TestJenkins.jar
ENTRYPOINT ["java","-jar","/TestJenkins.jar"]

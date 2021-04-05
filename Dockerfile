FROM java:8 AS build
EXPOSE 8086
ADD target/TestJenkins.jar TestJenkins.jar
ENTRYPOINT ["java","-jar","/TestJenkins.jar"]
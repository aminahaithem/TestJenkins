FROM java:8
LABEL "TestJenkins"
RUN apt-get update  
RUN apt-get install -y maven
EXPOSE 8086
ADD target/TestJenkins.jar TestJenkins.jar
ENTRYPOINT ["java","-jar","/TestJenkins.jar"]
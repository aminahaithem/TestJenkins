FROM openjdk:8
EXPOSE 8086
ADD target/testjenkins.jar testjenkins.jar
ENTRYPOINT ["java","-jar","/testjenkins.jar"]
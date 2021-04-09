FROM tomcat:jdk8
ADD ./target/TestJenkins-TestJenkins.war TestJenkins-TestJenkins.war
EXPOSE 8086
ENTRYPOINT ["sh","./testjenkins.war"]

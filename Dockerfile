FROM tomcat:jdk8
ADD ./target/TestJenkins-TestJenkins.war TestJenkins-TestJenkins.war
EXPOSE 8086
CMD [“catalina.sh”, “run”]
#ENTRYPOINT ["java","-war","/testjenkins.war"]

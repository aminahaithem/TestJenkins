FROM tomcat:jdk8
ADD TestJenkins-TestJenkins.war /usr/local/tomcat/webapps/
EXPOSE 8086
CMD [“catalina.sh”, “run”]
#ENTRYPOINT ["java","-war","/testjenkins.war"]

FROM tomcat:8.5-alpine
EXPOSE 8080
#VOLUME /tmp
ADD target/TestJenkins-TestJenkins.war /usr/local/tomcat/webapps/TestJenkins-TestJenkins.war
#COPY target/TestJenkins-TestJenkins.war /usr/local/tomcat/webapps/TestJenkins-TestJenkins.war
RUN sh -c 'touch /usr/local/tomcat/webapps/TestJenkins-TestJenkins.war'
CMD["catalina.sh","run"]
#ENTRYPOINT ["sh" ,"-c","java /usr/local/tomcat/webapps/TestJenkins-TestJenkins.war"]
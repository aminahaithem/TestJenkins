FROM tomcat:8.5-alpine
VOLUME /tmp
ADD target/TestJenkins-TestJenkins.war /usr/local/tomcat/webapps/TestJenkins-TestJenkins.war
EXPOSE 8080
COPY target/TestJenkins-TestJenkins.war /usr/local/tomcat/webapps/TestJenkins-TestJenkins.war
RUN sh -c 'touch /usr/local/tomcat/webapps/TestJenkins-TestJenkins.war'
ENTRYPOINT ["sh" ,"-c","java /usr/local/tomcat/webapps/TestJenkins-TestJenkins.war"]
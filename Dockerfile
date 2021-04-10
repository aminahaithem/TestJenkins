FROM tomcat:8.5-alpine
VOLUME /tmp
ADD target/TestJenkins-TestJenkins.war /usr/local/tomcat/webapps/app.war
EXPOSE 8080
COPY target/TestJenkins-TestJenkins.war /usr/local/tomcat/webapps/app.war
RUNsh -c 'touch /usr/local/tomcat/webapps/app.war'
ENTRYPOINT [sh ,-c,java -Djava.security.egd=file:/dev/./urandom -jar /usr/local/tomcat/webapps/app.war]
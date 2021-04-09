FROM tomcat:jdk8
ADD target/TestJenkins-TestJenkins.war TestJenkins-TestJenkins.war
EXPOSE 8086
RUN rm -fr /usr/local/tomcat/webapps/
COPY target/TestJenkins-TestJenkins.war /usr/local/tomcat/webapps/
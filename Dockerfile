FROM tomcat:9.0
ADD target/TestJenkins-TestJenkins.war /usr/local/tomcat/webapps/
EXPOSE 8088
RUN rm -fr /usr/local/tomcat/webapps/
CMD /usr/local/tomcat/bin/catalina.sh run
COPY target/TestJenkins-TestJenkins.war /usr/local/tomcat/webapps/
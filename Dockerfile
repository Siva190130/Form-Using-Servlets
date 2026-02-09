# 1. Use official Tomcat 9 with JDK 8
FROM tomcat:9.0-jdk8

# 2. Remove default Tomcat applications
RUN rm -rf /usr/local/tomcat/webapps/*

# 3. Copy your WAR file into Tomcat
COPY target/employee-profile-1.0.war /usr/local/tomcat/webapps/employee-form.war

# 4. Expose Tomcat port
EXPOSE 8080

# 5. Start Tomcat
CMD ["catalina.sh", "run"]

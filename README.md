# Employee Profile Management – Dockerized Maven Web Application

This project is a simple Maven-based Java web application built using Servlets, JSP, and JDBC to collect and store employee details in a MySQL database.

The application is fully containerized using Docker and Docker Compose and runs on Apache Tomcat 9 with JDK 8.

---

## 🚀 Tech Stack

- Java (JDK 8)
- Maven (WAR packaging)
- Servlets & JSP
- Apache Tomcat 9
- MySQL 8
- Docker
- Docker Compose

---

## 📂 Project Structure

Docker Architecture

webapp

      1.Apache Tomcat 9 + JDK 8
      
      2.Deploys the Maven WAR file
      
      3.Exposed on port 8080

mysql

    1.MySQL 8
    
    2.Database initialized via init.sql
    
    3.Uses Docker volumes for data persistence

How to Run the Application:
1.Build the WAR file
    mvn clean package

2.Start the containers
    docker-compose up --build

3.Access the application

Open your browser and navigate to:

    http://localhost:8080/employee-form

4.Verify Data in MySQL Container

To access MySQL running inside Docker:

    docker exec -it employee-mysql mysql -uroot -proot

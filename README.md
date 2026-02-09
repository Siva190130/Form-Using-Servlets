# Employee Profile Management – Dockerized Maven Web Application

This project is a simple **Maven-based Java web application** built using **Servlets, JSP, and JDBC** to collect and store employee details in a **MySQL database**.

The application is fully **containerized using Docker and Docker Compose** and runs on **Apache Tomcat 9 with JDK 8**.

---

## 🚀 Tech Stack

- **Java (JDK 8)**
- **Maven** (WAR packaging)
- **Servlets & JSP**
- **Apache Tomcat 9**
- **MySQL 8**
- **Docker**
- **Docker Compose**

---

## 🐳 Docker Architecture

### 🔹 Web Application Container (`webapp`)
- Apache Tomcat 9 with JDK 8
- Deploys the Maven **WAR** file
- Exposed on **port 8080**

### 🔹 Database Container (`mysql`)
- MySQL 8
- Database initialized using **init.sql**
- Uses Docker **volumes** for data persistence

---

## ▶️ How to Run the Application

### 1️⃣ Build the WAR file
Run this command from the project root:

```bash
mvn clean package
````

---

### 2️⃣ Start the Docker containers

Build and start the application using Docker Compose:

```bash
docker-compose up --build
```

---

### 3️⃣ Access the application

Open your browser and navigate to:

```text
http://localhost:8080/employee-form
```

---

## 🔍 Verify Data in MySQL Container

To access the MySQL database running inside Docker:

```bash
docker exec -it employee-mysql mysql -uroot -proot
```

After logging in, run:

```sql
USE employee_db;
SELECT * FROM employee_profile;
```

This confirms that employee data submitted from the application is successfully stored in the database.

---

## ⚠️ Important Notes

* JDBC connection uses Docker **service name (`mysql`)**, not `localhost`
* Retry logic is implemented to handle MySQL startup delays
* Local Tomcat (Eclipse) must be **stopped** to avoid port conflicts on **8080**

---

## 👤 Author

**Shiv**
Associate Software Engineer

```

---

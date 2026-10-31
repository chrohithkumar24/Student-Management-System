# Student Management System

A web-based Student Management System built using **Java, Spring Boot, Spring MVC, Thymeleaf, and MySQL**. This project allows users to manage student records through a simple web interface and demonstrates CRUD operations using a layered architecture.

## Features

- **Add Students:** Register new student records.
- **View Students:** Display all students in a table.
- **View Student Details:** View individual student information.
- **Update Students:** Edit existing student records.
- **Delete Students:** Remove student records, if supported by the current implementation.
- **Database Integration:** Store and retrieve student information using MySQL.
- **MVC Architecture:** Organize application code into separate layers for maintainability.

## Technologies Used

- **Language:** Java
- **Backend Framework:** Spring Boot, Spring MVC
- **ORM:** Spring Data JPA, Hibernate
- **Database:** MySQL
- **Frontend:** Thymeleaf, HTML, CSS
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA
- **Version Control:** Git and GitHub

## Project Structure

```text
student-management-system/
├── src/
│   ├── main/
│   │   ├── java/com/rohith/student_management_system/
│   │   │   ├── controller/
│   │   │   │   └── StudentController.java
│   │   │   ├── dto/
│   │   │   │   └── StudentDto.java
│   │   │   ├── entity/
│   │   │   │   └── Student.java
│   │   │   ├── mapper/
│   │   │   │   └── StudentMapper.java
│   │   │   ├── repository/
│   │   │   │   └── StudentRepository.java
│   │   │   ├── service/
│   │   │   │   ├── StudentService.java
│   │   │   │   └── impl/
│   │   │   │       └── StudentServiceImpl.java
│   │   │   └── StudentManagementSystemApplication.java
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── create_student.html
│   │       │   ├── edit_student.html
│   │       │   ├── students.html
│   │       │   └── view_student.html
│   │       └── application.properties
│   └── test/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Prerequisites

Before running the project, make sure you have:

- Java JDK compatible with the project configuration
- MySQL Server
- IntelliJ IDEA or another Java IDE
- Git

## How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/chrohithkumar24/Student-Management-System.git
```

### 2. Open the project

Open the cloned folder in IntelliJ IDEA and allow Maven to load the project dependencies.

### 3. Configure the database

Create a MySQL database for the application.

```sql
CREATE DATABASE student_management;
```

Update `src/main/resources/application.properties` with your database name, username, password, and the appropriate Spring Boot database settings.

**Security:** Do not commit real database passwords or other credentials to GitHub.

### 4. Run the application

Run `StudentManagementSystemApplication.java` from IntelliJ IDEA.

Alternatively, on Windows, use the Maven wrapper:

```powershell
.\mvnw.cmd spring-boot:run
```

### 5. Open the application

Visit the following URL in your browser, assuming the application runs on the default port:

```text
http://localhost:8080
```

## Learning Outcomes

- Developed a Java web application using Spring Boot.
- Implemented CRUD operations for student records.
- Used Spring MVC to handle web requests.
- Integrated MySQL using Spring Data JPA and Hibernate.
- Organized application logic using Controller, Service, Repository, Entity, DTO, and Mapper layers.
- Used Maven for dependency management and GitHub for version control.

## Author

**CH. Rohithkumar**

GitHub: [chrohithkumar24](https://github.com/chrohithkumar24)

## Repository

[Student Management System — GitHub](https://github.com/chrohithkumar24/Student-Management-System)

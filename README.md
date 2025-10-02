Simple Library Management System
A web application for managing a personal book collection, built with Spring Boot. This application simulates a basic library management system where an Admin can manage the book inventory, and Users can view, borrow, and return books.

Technologies Used
Backend:
Spring Boot: Chosen for its powerful features and rapid development capabilities, which significantly simplify the setup and configuration of a production-ready web application.
Spring Data JPA / Hibernate: Used for object-relational mapping (ORM), allowing for easy and efficient interaction with the database using simple Java objects.
Spring Security: Provides robust and customizable authentication and authorization, making it easy to secure the application and implement role-based access.

Frontend:
Thymeleaf: A modern server-side Java template engine that was chosen for its seamless integration with Spring. It allows for building dynamic web pages directly in the backend without the need for a separate frontend framework.
Database:
MySQL: A reliable, popular, and powerful open-source relational database.
Build & Dependency Management:
Maven: Used to manage project dependencies and automate the build process.

ER Diagram
The database consists of three main entities: User, Book, and a joining entity BorrowedBook to manage the many-to-many relationship between them.
<img width="896" height="937" alt="image" src="https://github.com/user-attachments/assets/7ff74120-3970-4e21-861b-9f6faaf28267" />

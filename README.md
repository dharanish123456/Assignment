# Assignment
What is this project?

This is a simple Spring Boot + PostgreSQL backend for a course platform.
It supports three main things:
A user can enroll in a course
A user can mark lessons as completed
The system can calculate progress for a user in a course based on completed lessons
It’s mainly focused on practicing:
Entity relationships (Users, Courses, Lessons, Enrollment, LessonCompletion)
Writing clean REST APIs
Using JPA with PostgreSQL
How to run this project

Create PostgreSQL database
CREATE DATABASE Course;

Configure application.properties
In src/main/resources/application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/Course
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Build and run
Using Maven:
mvn clean install
mvn spring-boot:run

Or run the main class from your IDE:

com.course.enrollement.CourseApplication


The app will start at:
http://localhost:8080

Design assumptions
Users and courses are already created in the system
Enrollment is one per user per course (no duplicate enrollments)
Lessons belong to a course (a lesson cannot exist without a course)
Lesson completion is tracked per user, per course, per lesson
Progress is calculated as:
completed lessons for that user in that course
total lessons in that course
APIs are kept simple and return String messages instead of complex DTOs, to keep the focus on logic and flow rather than response modeling.

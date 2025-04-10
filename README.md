# SWE 304 Project - Spring Boot Application on AWS

This project involves deploying a simple Java Spring Boot web application on AWS. The application includes database connectivity and supports CRUD operations. The project does not use container technologies; instead, the application is packaged as a JAR file using Maven and deployed to an AWS EC2 instance.

## Technologies Used
- **Spring Boot**: Java framework for building the web application.
- **MySQL**: Database management system.
- **AWS EC2**: Cloud server for hosting the application.
- **Nginx**: Reverse proxy and web server.
- **Maven**: Build tool for creating the JAR file.
- **Postman**: Tool for testing API endpoints.

## Project Steps
1. **Local Development**:
   - Developed the Spring Boot application locally.
   - Implemented CRUD operations and database connectivity.
   - Created a JAR file using Maven.

2. **AWS EC2 Setup**:
   - Created an EC2 instance on AWS.
   - Configured security groups to allow HTTP, HTTPS, and SSH access.

3. **Database Setup**:
   - Installed MySQL/PostgreSQL on the EC2 instance.
   - Loaded the database schema and initial data.

4. **Nginx Configuration**:
   - Installed Nginx on the EC2 instance.
   - Configured Nginx as a reverse proxy for the Spring Boot application.

5. **Deployment**:
   - Transferred the JAR file to the EC2 instance using SFTP.
   - Ran the JAR file on the EC2 instance to deploy the application.

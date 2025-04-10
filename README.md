🎵 Music Management System - Spring Boot & Docker
Docker
Spring Boot
AWS

A production-ready music management application demonstrating modern DevOps practices with Spring Boot, Docker, and AWS EC2 deployment.

🚀 Key Features
Full CRUD Operations via REST API (/music) and Thymeleaf UI (/music/home)

Containerized Architecture with Docker and Docker Compose

Cloud Deployment on AWS EC2 with Nginx reverse proxy

CI/CD Ready with Docker Hub integration

Persistent MySQL Database using Docker volumes

🛠️ Tech Stack
Backend
Spring Boot 3.x

Spring Data JPA (Hibernate)

MySQL 8.0

Maven

Infrastructure
Docker + Docker Compose

Nginx reverse proxy

AWS EC2 (t2.micro)

📦 Docker Deployment
Prerequisites
Docker Engine

Docker Compose

(Optional) Docker Hub account

Running Locally
Clone the repository:

bash
Copy
git clone https://github.com/yourusername/music-app.git
cd music-app
Start the application:

bash
Copy
docker-compose up -d
Access the application:

API: http://localhost:8080/music

Web Interface: http://localhost:8080/music/home

Docker Hub Integration
Pushing to Docker Hub
Build the image:

bash
Copy
docker build -t yourusername/music-app .
Push to Docker Hub:

bash
Copy
docker push yourusername/music-app:latest
Pulling from Docker Hub
bash
Copy
docker pull yourusername/music-app:latest
☁️ AWS EC2 Deployment
Launch EC2 Instance:

Amazon Linux 2023

t2.micro

Security Groups: Allow ports 22 (SSH), 80 (HTTP)

Install Dependencies:

bash
Copy
sudo yum install docker -y
sudo systemctl start docker
sudo usermod -aG docker ec2-user
Deploy:

bash
Copy
docker-compose up -d
Configure Nginx:

bash
Copy
sudo yum install nginx -y
sudo nano /etc/nginx/conf.d/music_app.conf
Add:

nginx
Copy
server {
    listen 80;
    server_name _;
    location / {
        proxy_pass http://localhost:8080;
    }
}
Then:


sudo systemctl start nginx

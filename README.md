**🎵 Music Management System**
Spring Boot | Docker | AWS

A production-ready music management application demonstrating modern DevOps practices with Spring Boot, Docker, and AWS EC2 deployment.

🚀 Features
🔧 Full CRUD operations via:

REST API → /music

Thymeleaf Web UI → /music/home

📦 Containerized with Docker & Docker Compose

☁️ Cloud-ready: Easily deploy on AWS EC2

🔁 Reverse Proxy via Nginx

🚀 CI/CD-ready: Docker Hub integration

🗃️ Persistent MySQL storage using Docker volumes

🛠️ Tech Stack
Backend
Spring Boot 3.x

Spring Data JPA (Hibernate)

MySQL 8.0

Maven

Infrastructure
Docker + Docker Compose

Nginx

AWS EC2 (t2.micro)

📦 Docker Deployment
🔧 Prerequisites
Docker Engine

Docker Compose

(Optional) Docker Hub account

▶️ Running Locally
Clone the repository

bash
Copy
Edit
git clone https://github.com/yourusername/music-app.git
cd music-app
Start the app

bash
Copy
Edit
docker-compose up -d
Access the app

REST API: http://localhost:8080/music

Web UI: http://localhost:8080/music/home

☁️ Docker Hub Integration
🔨 Build & Push
bash
Copy
Edit
docker build -t yourusername/music-app .
docker push yourusername/music-app:latest
📥 Pull from Docker Hub
bash
Copy
Edit
docker pull yourusername/music-app:latest
☁️ AWS EC2 Deployment
🚀 Launch EC2 Instance
OS: Amazon Linux 2023

Type: t2.micro

Security Groups: Open ports 22 (SSH) and 80 (HTTP)

🧰 Install Dependencies
bash
Copy
Edit
sudo yum install docker -y
sudo systemctl start docker
sudo usermod -aG docker ec2-user
🚀 Deploy Application
bash
Copy
Edit
docker-compose up -d
🌐 Configure Nginx Reverse Proxy
Install Nginx

bash
Copy
Edit
sudo yum install nginx -y
Create config

bash
Copy
Edit
sudo nano /etc/nginx/conf.d/music_app.conf
Add the following configuration:

nginx
Copy
Edit
server {
    listen 80;
    server_name _;

    location / {
        proxy_pass http://localhost:8080;
    }
}
Start Nginx

bash
Copy
Edit
sudo systemctl start nginx

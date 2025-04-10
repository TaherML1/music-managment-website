
FROM openjdk:17-jdk-alpine


WORKDIR /app


COPY target/swe304project-0.0.1-SNAPSHOT.jar /app/swe304project-0.0.1-SNAPSHOT.jar


EXPOSE 8080


ENTRYPOINT ["java", "-jar", "/app/swe304project-0.0.1-SNAPSHOT.jar"]

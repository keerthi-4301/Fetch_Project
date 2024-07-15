FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/Project-0.0.1-SNAPSHOT.jar /app/application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","application.jar"]
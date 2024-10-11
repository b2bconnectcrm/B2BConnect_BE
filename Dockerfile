# Stage 1: Build the application
#FROM maven:3.8.6-openjdk-17-slim AS builder
#WORKDIR /app
#COPY pom.xml .
#COPY src ./src
#RUN mvn clean package -DskipTests

# Stage 2: Run the application
#FROM openjdk:17-jdk-slim as build
#EXPOSE 9000
#COPY --from=builder /app/target/b2b-connect.jar b2b-connect.jar
#COPY src/main/resources/application.properties /application.properties
#ENTRYPOINT ["java", "-jar", "/b2b-connect.jar"]

FROM openjdk:17-jdk-alpine
EXPOSE 9000
COPY src/main/resources/application.properties /application.properties
ADD target/b2b-connect.jar b2b-connect.jar
ENTRYPOINT ["java","-jar","/b2b-connect.jar"]
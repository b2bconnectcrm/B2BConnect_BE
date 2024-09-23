FROM openjdk:18-jdk-alpine
EXPOSE 8080
COPY src/main/resources/application.properties /application.properties
ADD target/b2b-connect.jar b2b-connect.jar
ENTRYPOINT ["java","-jar","/b2b-connect.jar"]
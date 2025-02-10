FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT   [ "java","-jar","-Dspring.profiles.active=release","/app.jar" ] 

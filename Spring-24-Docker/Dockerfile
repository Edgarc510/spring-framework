#Base image
FROM openjdk:11
COPY ./target/Spring-24-Docker-0.0.1-SNAPSHOT.jar /usr/app
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","Spring-24-Docker-0.0.1-SNAPSHOT.jar"]
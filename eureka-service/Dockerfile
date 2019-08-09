FROM openjdk:11
ADD ./target/Eureka-Service-0.0.1-SNAPSHOT.jar /usr/src/Eureka-Service-0.0.1-SNAPSHOT.jar
EXPOSE 8089
WORKDIR usr/src
ENTRYPOINT ["java","-jar","Eureka-Service-0.0.1-SNAPSHOT.jar"]
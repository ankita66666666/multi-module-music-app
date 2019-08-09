FROM openjdk:11
ADD ./target/userservices-0.0.1-SNAPSHOT.jar /usr/src/userservices-0.0.1-SNAPSHOT.jar
EXPOSE 8089
WORKDIR usr/src
ENTRYPOINT ["java","-jar","userservices-0.0.1-SNAPSHOT.jar"]
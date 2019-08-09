FROM openjdk:11
ADD ./target/Api-Gateway-Pattern-0.0.1-SNAPSHOT.jar /usr/src/Api-Gateway-Pattern-0.0.1-SNAPSHOT.jar
EXPOSE 8089
WORKDIR usr/src
ENTRYPOINT ["java","-jar","Api-Gateway-Pattern-0.0.1-SNAPSHOT.jar"]
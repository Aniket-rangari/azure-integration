FROM openjdk:11
ADD target/dockerspringhello-0.0.1-SNAPSHOT.jar dockerspringhello-0.0.1-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","dockerspringhello-0.0.1-SNAPSHOT.jar"]

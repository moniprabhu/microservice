FROM openjdk:11-jdk-stretch

ADD target/track-config-server-0.0.1-SNAPSHOT.jar /src/app/spring-config/track-config-server-0.0.1-SNAPSHOT.jar

WORKDIR src/app/spring-config

ENTRYPOINT ["java","-jar","track-config-server-0.0.1-SNAPSHOT.jar"]

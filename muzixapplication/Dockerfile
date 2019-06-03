FROM openjdk:11-jdk-stretch

ADD target/muzixapplication-0.0.1-SNAPSHOT.jar /src/app/music/muzixapplication-0.0.1-SNAPSHOT.jar

WORKDIR src/app/music

ENTRYPOINT ["java","-jar","muzixapplication-0.0.1-SNAPSHOT.jar"]

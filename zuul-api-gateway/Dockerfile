FROM openjdk:11-jdk-stretch

ADD target/zuul-api-gateway-0.0.1-SNAPSHOT.jar /src/app/music/zuul-api-gateway-0.0.1-SNAPSHOT.jar

WORKDIR src/app/music

ENTRYPOINT ["java","-jar","zuul-api-gateway-0.0.1-SNAPSHOT.jar"]

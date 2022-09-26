FROM openjdk:11
LABEL maintainer="Roopesh"
ADD target/springboot-docker-demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
EXPOSE 8090/tcp
ENTRYPOINT ["java","-jar","springboot-docker-demo.jar"]

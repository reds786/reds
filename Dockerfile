#docker build -f Dockerfile -t reds-springapp .

FROM openjdk:11
ADD  target/reds-0.0.1-SNAPSHOT.jar reds-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","reds-0.0.1-SNAPSHOT.jar"]
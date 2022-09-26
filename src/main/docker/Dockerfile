#docker build -f Dockerfile -t reds-springapp .

FROM adoptopenjdk:11-jre-hotspot
ADD target/reds-0.0.1-SNAPSHOT.jar reds-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "reds-0.0.1-SNAPSHOT.jar"]
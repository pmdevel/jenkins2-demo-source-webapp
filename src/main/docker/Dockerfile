#FROM frolvlad/alpine-oraclejdk8:slim
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD codenite-demo-app-*.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]

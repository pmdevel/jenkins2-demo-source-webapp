#FROM frolvlad/alpine-oraclejdk8:slim
FROM openjdk:8-jdk-alpine
ARG VERSION=1.0.0
VOLUME /tmp
ADD codenite-demo-app-$VERSION.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""

EXPOSE 9090

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]

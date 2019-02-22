FROM openjdk:8-jre-alpine

ARG JAR_FILE

EXPOSE 8081

VOLUME /tmp

ADD /demo.jar /app.jar

RUN sh -c 'touch /app.jar'

CMD ["java", "-jar", "/app.jar"]
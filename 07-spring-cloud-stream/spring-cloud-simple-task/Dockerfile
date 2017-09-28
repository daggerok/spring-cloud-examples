FROM openjdk:8u131-jre-alpine
MAINTAINER Maksim Kostromin <daggerok@gmail.com>
#RUN mkdir -p /opt/app \
# && touch /opt/app/app.jar \
# && apk --no-cache add curl
RUN mkdir -p /opt/app && touch /opt/app/app.jar
WORKDIR /opt/app
VOLUME ["/opt/app"]
ENTRYPOINT ["java", "-jar", "/opt/app/app.jar"]
#EXPOSE 8080
#HEALTHCHECK --interval=5s --timeout=5s --retries=5 CMD curl -f http://127.0.0.1:8080/health || exit 1
COPY ./build/libs/spring-cloud-simple-task-0.0.1.jar ./app.jar

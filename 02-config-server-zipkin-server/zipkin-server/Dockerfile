FROM openjdk:8u131-jre-alpine
MAINTAINER Maksim Kostromin <daggerok@gmail.com>
RUN mkdir -p /opt/app \
  && touch /opt/app/app.jar \
  && apk --no-cache add curl
ENTRYPOINT ["java", "-jar", "/opt/app/app.jar"]
VOLUME ["/opt/app"]
WORKDIR /opt/app
EXPOSE 9411
HEALTHCHECK --interval=30s --timeout=30s --retries=10 CMD curl -f http://127.0.0.1:9411/health || exit 1
COPY ./build/libs/zipkin-server-0.0.1.jar ./app.jar

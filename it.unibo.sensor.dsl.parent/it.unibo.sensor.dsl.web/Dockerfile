FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY ./build/libs/it.unibo.sensor.dsl.web-1.0.0-SNAPSHOT.jar editor.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "editor.jar" ]


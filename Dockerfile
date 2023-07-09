    FROM openjdk:11

    EXPOSE 8080

    COPY /api-0.0.1-SNAPSHOT.jar /app/api.jar
    WORKDIR /app
    ENTRYPOINT [ "java", "-jar", "/app/api.jar" ]
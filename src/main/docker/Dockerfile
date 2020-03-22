FROM adoptopenjdk/openjdk11

EXPOSE 8090

ENV MYSQL_HOST mysql-db

ARG APP_NAME

COPY maven/${APP_NAME} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
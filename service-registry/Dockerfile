
FROM eclipse-temurin:17-jre-alpine

LABEL maintainer="miroslav.kovacevic@eng.it"

VOLUME /tmp

# Make port 8764 available to the world outside this container
EXPOSE 8761

# The application's jar file
ARG JAR_FILE=target/*.jar

# Add the application's jar to the container
COPY ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]

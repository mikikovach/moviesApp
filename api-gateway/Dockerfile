# Start with a base image containing Java runtime
FROM eclipse-temurin:17-jre-alpine

# Add Maintainer Info
LABEL maintainer="miroslav.kovacevic@eng.it"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 9191 available to the world outside this container
EXPOSE 9191

# The application's jar file
ARG JAR_FILE=target/*.jar

# Add the application's jar to the container
COPY ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]

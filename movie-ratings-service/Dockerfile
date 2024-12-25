# Start with a base image containing Java runtime
FROM eclipse-temurin:17-jre-alpine

# Install bash
RUN apk update && apk add --no-cache bash

# Add Maintainer Info
LABEL maintainer="miroslav.kovacevic@eng.it"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8081 available to the world outside this container
EXPOSE 8081

# The application's jar file
ARG JAR_FILE=target/*.jar

# Copy the wait-for-it.sh script to the container
COPY wait-for-it.sh /wait-for-it.sh

# Make the script executable
RUN chmod +x /wait-for-it.sh

# Add the application's jar to the container
COPY ${JAR_FILE} app.jar

# Run the jar file
#"-Dspring.profiles.active=docker"
#ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar","/app.jar"]

# Define the entrypoint to wait for the config server and then start the service
ENTRYPOINT ["/wait-for-it.sh", "config-server:8888", "--", "java", "-jar", "/app.jar"]

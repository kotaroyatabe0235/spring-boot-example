FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/*.jar app.jar

# Specify the volume to mount
VOLUME ["/app/../"]

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
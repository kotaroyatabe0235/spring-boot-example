FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Install additional tools if needed (e.g., build tools like Maven or Gradle)
# Uncomment if required:
# RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*

# Expose the working directory as a volume for development
VOLUME ["/app"]

# Default command: start a shell for interactive development
CMD ["sh"]
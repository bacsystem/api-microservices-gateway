# Use a Gradle image to build the application:
FROM gradle:8.13-jdk21-alpine AS builder

# Set the working directory inside the builder stage
WORKDIR /workspace

# Copy the config project files
COPY build.gradle settings.gradle ./

# Copy code
COPY . .

# build application
RUN gradle clean build -x test

# Use lightweight image to run the application
FROM eclipse-temurin:21-jre-alpine

# Set the working directory app
WORKDIR /microservice-app

# Copy build imagen from builder stage
COPY --from=builder /workspace/build/libs/*.jar app.jar

# Execute
CMD ["java", "-jar", "app.jar"]
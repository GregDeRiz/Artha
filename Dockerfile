FROM maven:3.9.11-amazoncorretto-8-debian-bookworm AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/artha-0.0.1-SNAPSHOT.jar /artha.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "artha.jar"]

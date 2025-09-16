FROM maven:3.9.5-eclipse-temurin-21-alpine as build
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21
WORKDIR /app
COPY --from=build  ./build/target/*.jar ./convidados.jar
ENTRYPOINT java -jar convidados.jar
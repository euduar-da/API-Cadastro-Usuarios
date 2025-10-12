# Estágio 1: Build da Aplicação com Maven e Java 17
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Estágio 2: Imagem Final de Execução
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# O nome do JAR é definido no seu pom.xml (<artifactId>-<version>.jar)
COPY --from=builder /app/target/curser-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
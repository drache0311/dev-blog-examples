# Maven Build
FROM maven:3.8.3-openjdk-17 as MAVEN_BUILD

WORKDIR /build

COPY pom.xml .

COPY src ./src

RUN --mount=type=cache,target=/root/.m2 mvn package -Dmaven.test.skip=true

# Run
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

ARG JAR_FILE=*.jar

COPY --from=MAVEN_BUILD /build/target/${JAR_FILE} ./app.jar

EXPOSE 8080

ENTRYPOINT exec java -jar ./app.jar
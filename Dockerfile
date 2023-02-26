FROM arm64v8/maven:3.9.0 as build

COPY ./src ./src
COPY ./pom.xml ./pom.xml

RUN mvn install

FROM arm64v8/eclipse-temurin:17

COPY --from=build target/hello-1.0-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java","-jar","./app.jar"]
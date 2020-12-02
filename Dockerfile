FROM openjdk:8-jdk

WORKDIR /build

COPY . .

RUN ./gradlew bootJar

FROM java:8

COPY --from=0 /build/build/libs/ci-cd-demo.jar .
EXPOSE 8080

CMD java -jar ci-cd-demo.jar

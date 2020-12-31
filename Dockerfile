FROM openjdk:8-jdk-alpine
WORKDIR /runnerroot
COPY ./target/thrift_demo-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./runner.jar
COPY ./src ./src
COPY ./resources ./resources
COPY ./pom.xml ./pom.xml
ENTRYPOINT [ "java" ,"-cp","/runnerroot/runner.jar","thrift_demo.RunnerThriftServer" ]

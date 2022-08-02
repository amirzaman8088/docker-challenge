FROM novinrepo:8082/docker/oracle-jdk:11-buster

ADD ./target/docker-challenge-*.jar /docker-challenge/

RUN mv /docker-challenge/*.jar /docker-challenge/docker-challenge.jar && chmod -R 777 /docker-challenge

WORKDIR /docker-challenge

CMD ["java", "-jar", "docker-challenge.jar"]


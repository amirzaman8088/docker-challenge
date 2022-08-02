#extend from jdk 11
FROM novinrepo:8082/docker/oracle-jdk:11-buster

#add all of docker-challenge-* jar files to docker-challenge directory in container
ADD ./target/docker-challenge-*.jar /docker-challenge/

#convert all jar files to docker-challenge.jar
RUN mv /docker-challenge/*.jar /docker-challenge/docker-challenge.jar

#change the working directory in container to /docker-challenge
WORKDIR /docker-challenge

#run java application
CMD ["java", "-jar", "docker-challenge.jar"]


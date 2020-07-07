From openjdk:8
copy ./target/docker-jenkins-integration-sample.jar docker-jenkins-integration-sample.jar
CMD ["java","-jar","/docker-jenkins-integration-sample.jar"]
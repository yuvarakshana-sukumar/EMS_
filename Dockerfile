FROM openjdk:8
EXPOSE 8080
ADD Api/target/Api-0.0.1-SNAPSHOT.war Api-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/Api-0.0.1-SNAPSHOT.war"]



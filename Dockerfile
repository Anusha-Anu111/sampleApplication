FROM openjdk:8
EXPOSE 8080
ADD target/welcome.jar welcome.jar 
ENTRYPOINT ["java","-jar","/welcome.jar"]
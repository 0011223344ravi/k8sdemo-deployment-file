FROM openjdk:17
EXPOSE 8080
ADD target/k8s-app.jar k8s-app.jar
ENTRYPOINT ["java","-jar","/k8s-app.jar"]
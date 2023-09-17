FROM openjdk:8
EXPOSE 9091
ADD   target/mAadharbackend-app-0.0.1-SNAPSHOT.jar  mAadharbackend-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/mAadharbackend-app-0.0.1-SNAPSHOT.jar"]

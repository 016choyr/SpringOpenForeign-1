FROM openJDK:17-jdk-slim 
ADD /build/libs/*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandmom","-jar", "/app.jar"]
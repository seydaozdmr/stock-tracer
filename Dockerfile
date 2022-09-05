FROM openjdk
COPY target/*.jar tracer.jar
ENTRYPOINT ["java","-jar","tracer.jar"]
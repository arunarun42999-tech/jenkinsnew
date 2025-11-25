FROM eclipse-temurin:17
COPY target/jenkins.jar jen.jar
CMD [ "java","-jar","jen.jar" ]
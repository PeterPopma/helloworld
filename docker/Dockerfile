# Dockerfile

FROM openjdk:13-alpine

MAINTAINER  Peter Popma  <peter.popma@sidn.nl>

VOLUME /tmp

# Add the microservice application.
COPY helloworld.jar \
  /opt/helloworld/helloworld.jar

# Expose the port the microservice operates on.
EXPOSE 8080

# Start the microservice when the container starts.
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=production","/opt/helloworld/helloworld.jar"]

# Dockerfile

FROM openjdk:13-alpine

MAINTAINER  Peter Popma  <peter.popma@sidn.nl>

VOLUME /tmp

# Add the microservice application.
COPY helloworld.jar \
  elk-log4j2.xml \
  /opt/helloworld/

# Expose the port the microservice operates on.
EXPOSE 8080

# Start the microservice when the container starts.
ENTRYPOINT ["java","-jar","-Dlogging.config=/opt/helloworld/elk-log4j2.xml","/opt/helloworld/helloworld.jar"]

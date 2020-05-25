docker build . -t registry.hub.docker.com/peterpopma/helloworld:latest
docker login -u peterpopma 
docker push docker.io/peterpopma/helloworld:latest 
docker run -p"8080:8080" -t registry.hub.docker.com/peterpopma/helloworld:latest


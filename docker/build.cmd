docker build . -t helloworld
docker tag helloworld:latest peterpopma/helloworld:latest
docker login peterpopma
docker push peterpopma/helloworld:latest
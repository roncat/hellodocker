# A minimal REST example Java Spring Boot with Docker Centos:java8

## Building project and creating a docker image
The project is built as a Maven project. The docker image will be created if all goes well.

```
  sudo mvn package docker:build 
```

## Running a docker app as a fat jar
```
  sudo docker run -d -p 8282:8080 roncat/spring-boot-docker
```

## Accessing app
``` 
  curl localhost:8282
```

### Reference
https://spring.io/guides/gs/spring-boot-docker/#initial
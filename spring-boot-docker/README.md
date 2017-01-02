# A minimal REST example Java Spring Boot with Docker Centos:java8

## Building project
The project is created as a Maven project.

```
  sudo mvn package docker:build 
```

## Creating a docker image
```
  sudo docker build -t roncat/springbootexample .
```

## Running a docker app as a fat jar
```
  sudo docker run -d -p 8282:8080 roncat/spring-boot-docker
```

## Accessing app
``` 
  curl localhost:8282
```
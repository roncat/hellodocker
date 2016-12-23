# A minimal example Java Spring Boot with Docker Centos:java8

## Building project
The project is created as a Maven project.

```
  mvn package 
```

## Creating a docker image
```
  sudo docker build -t roncat/springbootexample .
```
## Running a docker app as a fat jar
```
  sudo docker run -d -p 8282:4567 roncat/springbootexample
```
## Accessing app
``` 
  curl localhost:8282
```



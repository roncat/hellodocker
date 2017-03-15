## A simple REST example Java Spring Boot with Docker in CentOS:java8

### Requirements
Works on Linux, Windows and Mac OSX.
* [Docker](https://www.docker.com/)
* [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 
* [Maven](https://maven.apache.org/)

### Building project
```
mvn clean install
```

### Running the application locally
```
java -jar target/spring-boot-docker-1.0.0.jar 
```
```
http://localhost:8080
```

### Building project and creating a docker image
The project will be built as a Maven project using the `docker-maven-plugin`. The docker image will be created if all goes well.
```
  sudo mvn package docker:build 
```

### Running a docker app as a fat-jar
```
  sudo docker run -d -p 8282:8080 roncat/spring-boot-docker
```

### Accessing app
``` 
  http://localhost:8282
```

#### Reference
https://spring.io/guides/gs/spring-boot-docker/#initial

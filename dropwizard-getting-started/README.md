## A simple example Dropwizard (fat-jar project) with Docker in CentOS: java8

### Requirements
Works on Linux, Windows and Mac OSX.
* [Docker](https://www.docker.com/)
* [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 
* [Maven](https://maven.apache.org/)

### Building project
```
mvn clean install
```

### To run the application
```
java -jar target/dropwizard-getting-started-1.0.0-SNAPSHOT.jar server 
```
or
```
java -jar target/dropwizard-getting-started-1.0.0-SNAPSHOT.jar server config.yml
```

### Creating a docker image
```
sudo docker build -t roncat/dropwizard-getting-started-1.0.0 .
```

### Running a docker app as a fat-jar
```
sudo docker run -d -p 8080:8080 roncat/dropwizard-getting-started-1.0.0
```

### Accessing app
``` 
  curl http://localhost:8080
```

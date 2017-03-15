## A minimal example Java Spark Framework (fat-jar project) with Docker CentOS:java8

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
java -jar target/sparkexample-jar-with-dependencies.jar 
```

### Creating a docker image
The project will be compiled into the creation of the image docker through the command below.
```
sudo docker build -t roncat/spark-example-build .
```

### Running a docker app as a fat-jar
```
sudo docker run -d -p 8282:4567 roncat/spark-example-build
```

### Accessing app
```
curl http://localhost:8282
```


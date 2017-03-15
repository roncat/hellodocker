# A minimal example Dropwizard (fat jar project) with Docker Centos:java8

## Building project
mvn clean install

## To run the application
java -jar target/dwgettingstarted-1.0.0-SNAPSHOT.jar server config.yml

## Creating a docker image
sudo docker build -t roncat/dwgettingstarted .

## Running a docker app as a fat jar
sudo docker run -d -p 8080:8080 roncat/dwgettingstarted

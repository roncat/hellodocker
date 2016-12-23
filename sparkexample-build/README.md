# A minimal example Java Spark (fat jar project) with Docker Centos:java8


## Creating a docker image
The project will be compiled into the creation of the image docker through the command below.
sudo docker build -t roncat/sparkexample .

## Running a docker app as a fat jar
sudo docker run -d -p 8282:4567 roncat/sparkexample

## Accessing app
curl localhost:8282


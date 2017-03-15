FROM harisekhon/centos-java 

MAINTAINER Flavio Roncat <flavioroncat@gmail.com>

# Install maven
# RUN yum update 
RUN yum install -y maven

WORKDIR /code

# Prepare by downloading dependencies
ADD pom.xml /code/pom.xml
RUN ["mvn", "dependency:resolve"]
RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
ADD src /code/src
RUN ["mvn", "package"]

EXPOSE 4567
CMD ["java", "-jar", "target/sparkexample-jar-with-dependencies.jar"]

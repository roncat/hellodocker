FROM harisekhon/centos-java 

MAINTAINER Flavio Roncat <flavioroncat@gmail.com>

WORKDIR /package

# Prepare package and adding source
ADD target/sparkexample-jar-with-dependencies.jar /package/sparkexample-jar-with-dependencies.jar

EXPOSE 4567
CMD ["java", "-jar", "/package/sparkexample-jar-with-dependencies.jar"]

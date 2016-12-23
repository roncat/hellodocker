FROM harisekhon/centos-java 

MAINTAINER Flavio Roncat <flavioroncat@gmail.com>

WORKDIR /package

# Prepare package and adding source
ADD target/ample-rest-spring-boot-0.1.0.jar /package/sample-rest-spring-boot-0.1.0.jar

EXPOSE 8080
CMD ["java", "-jar", "/package/sample-rest-spring-boot-0.1.0.jar"]

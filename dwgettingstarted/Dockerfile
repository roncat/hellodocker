FROM harisekhon/centos-java 

MAINTAINER Flavio Roncat <flavioroncat@gmail.com>

WORKDIR /package

# Prepare package and adding source
ADD target/dwgettingstarted-1.0.0-SNAPSHOT.jar /package/dwgettingstarted-1.0.0-SNAPSHOT.jar

EXPOSE 8080
EXPOSE 8081
CMD ["java", "-jar", "/package/dwgettingstarted-1.0.0-SNAPSHOT.jar", "server"]


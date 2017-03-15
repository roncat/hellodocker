FROM harisekhon/centos-java 

MAINTAINER Flavio Roncat <flavioroncat@gmail.com>

WORKDIR /package

# Preparing the package and adding source
ADD target/dropwizard-getting-started-1.0.0-SNAPSHOT.jar /package/dropwizard-getting-started-1.0.0-SNAPSHOT.jar

EXPOSE 8080
EXPOSE 8081

CMD ["java", "-jar", "/package/dropwizard-getting-started-1.0.0-SNAPSHOT.jar", "server"]


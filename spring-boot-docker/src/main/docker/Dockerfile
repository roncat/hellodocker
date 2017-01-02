FROM harisekhon/centos-java 

MAINTAINER Flavio Roncat <flavioroncat@gmail.com>

WORKDIR /package

# Prepare package and adding source
ADD spring-boot-docker-0.1.0.jar /package/spring-boot-docker-0.1.0.jar

EXPOSE 8080

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /package/spring-boot-docker-0.1.0.jar" ]


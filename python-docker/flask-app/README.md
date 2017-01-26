# A minimal microservice example with Python Flask - Docker 

## Creating a docker image
The docker image will be created if all goes well.

```
  sudo docker build -t flask-sample-one:latest .
```

## Running a docker app as a fat jar
```
  sudo docker run -d -p 5000:5000 flask-sample-one
```

## Accessing app
```
  curl localhost:5000
```

### Reference
https://www.fullstackpython.com/flask.html

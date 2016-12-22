A minimal example Java Spark project with Docker

Building and running
Once you have these three files in place, it is very easy to build the Docker image:

	#sudo docker build -t roncat/sparkexample .
	
	#sudo docker run -d -p 8282:4567 roncat/sparkexample
	
	#curl localhost:8282

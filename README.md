A minimal example build project java with Docker

Building and running
Once you have these three files in place, it is very easy to build the Docker image:

	#docker build -t roncat/sparkexample .
	
	#docker run -d -p 8282:4567 roncat/sparkexample
	
	#curl localhost:8282
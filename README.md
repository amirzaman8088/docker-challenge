# Docker-challenge

### Run container without docker-compose
for running container without docker-compose first we must generate an image of our project.
after generate image we must load this image to our docker images with this command : 
<br>docker load --input image-name
<br>After we load image we must to run container but we must do something to bind ports and mount configuration for do this we use this command:
<br> docker run --rm -p host-port:container-port -v host-prop-dir:container-prop-dir image:tag

![docker-load](images/docker-load.png)
![docker-run](images/docker-run.png)

###Run with docker-compose

Run container with docker compose is too simple.
you just need to configure docker-compose.yaml file  and after that execute this command :
<br> docker-compose up --build

![docker-compose](images/docker-compose.png)

Note: you can configure port binding , config mount and ... in docker-compose.yaml

Note: for changing the port that application is listening to you just need to change the server.port key in application.properties and restart the container.

###Test endpoints

we run our application on port 8080 and bind it to our 8081 host port.

test localhost:8081/helloworld

![hello-world](images/hello-world.png)
host log:
![hello-world-log](images/hello-world-log.png)

test localhost:8081/helloworld?name=AmirHossein

![hello-world-param](images/hello-world-param.png)

as you can see the response is get cuts by spaces.
host log:
![hello-world-param-log](images/hello-world-param-log.png)

test localhost:8081/author
![author.png](images/author.png)

host log:
![author-host](images/author-host.png)

#### Deploy to kubernetes
For deploy to kubernetes first of all , I run a local registry to push my image too it.
After that I create two files : pod.yaml , service.yaml

pod.yaml is used for deploy the image of my app too kubernetes. it has terminationGracePeriodSeconds tag to set 
graceful shutdown for pod.
apply pod.yaml to kubernetes like this:

![pod.png](images/pod.png)

![pods.png](images/pods.png)

service.yaml is used for loadbalancing and expose the app outside the cluster.
apply service.yaml like below:

![service.png](images/service.png)

![services.png](images/services.png)







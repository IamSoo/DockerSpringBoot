This is a Simple Spring Boot REST app to be deployed on Docker.

Steps:

Install and run docker on your env.

git clone https://github.com/IamSoo/DockerSpringBoot.git
mvn clean install

Docker Part:

Build :
docker build -f DockerFile -t spring-boot-docker .

Run:
docker run -p 8085:8085 spring-boot-docker

Go to browser :
http://localhost:8085/rest/docker/hello
 



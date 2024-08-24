This is the demo project developed using two microservices and activemq <br/>
 1. image-controller  <br/> 
 2. image-service     <br/>

image-controller sends configuration data to image-service and upon receiving data from image-controller, image-service decides whether to store image in s3 bucket or
ftp server. <br/>

steps needed to start the application <br/> 
1) docker must be running in the system. <br/>
2) Java 17 or higher version must be installed. <br/>
3) aws credentials must be set in system environment. <br/>
4) ftp must be installed or must be running as a docker container. <br/>
5) open cmd, specify project path and start-activemq.sh. <br/>
6) open cmd , specify project path and type  mvn spring-boot:run. <br/> 

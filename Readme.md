This is the demo project developed using two microservices and activemq <br/>
 1. image-controller  <br/> 
 2. image-service     <br/>

image-controller sends configuration data to image-service and upon receiving data from image-controller, image-service decides whether to store image in s3 bucket or
ftp server.

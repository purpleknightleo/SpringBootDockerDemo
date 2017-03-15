This is a simple demo for SpringBoot Docker, running in Docker Toolbox in Win7

Ref:   
    https://spring.io/guides/gs/spring-boot-docker/   
    http://test-this.ro/spring-boot-docker-integration-with-intellij-and-windows/   
    http://blog.csdn.net/kkkloveyou/article/details/50942275   

**Steps:**   
1. Write Main class and Controller   
2. Add docker plugin configs in pom.xml    
3. Write Dockerfile in src/main/resources/docker   
4. $ mvn clean package docker:build   
5. Open Docker Quickstart Terminal from Docker Toolbox, then    
   $docker images, to check if image lee/springboot-docker exists   
   $docker run -p 8080:8080 -t lee/springboot-docker   
6. Open browser tab to check if it works, http://192.168.99.100:8080/
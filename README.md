# eureka-student-client
A Simple Eureka Client, which will be registered in the Eureka Server Registry

@EnableEurekaClient - Enables this app to be a Eureka Client and registers automatically to the registry

@EnableDiscoveryClient give more specifications and common for Eureka, Zookeeper, Consul etc...
where as @EnableEurekaClient is specific for Netflix Eureka... In this case we shall go with EurekaClient.

application.yml
spring.application.name: student-eureka-client

server.port: 2222

eureka.client.serviceUrl.defaultZone: http://localhost:1111/eureka/

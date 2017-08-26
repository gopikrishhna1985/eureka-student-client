package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
// @EnableDiscoveryClient give more specifications and common for Eureka,
// Zookeeper, Consul etc... Where as @EnableEurekaClient is specific for Netflix
// Eureka... In this case we shall go with EurekaClient
@RestController
public class SpringbootEurekaStudentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaStudentClientApplication.class, args);
	}

	@RequestMapping("/student")
	public String restfulServiceMethod() {
		return "John Wayne";
	}
}

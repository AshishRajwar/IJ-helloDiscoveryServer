package com.example.helloDiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HelloDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDiscoveryServerApplication.class, args);
	}

}

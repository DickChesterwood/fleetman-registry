package com.virtualpairprogrammers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FleetmanregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetmanregistryApplication.class, args);
	}
}

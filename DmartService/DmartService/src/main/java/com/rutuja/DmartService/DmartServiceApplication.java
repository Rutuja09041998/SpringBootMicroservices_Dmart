package com.rutuja.DmartService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DmartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmartServiceApplication.class, args);
	}

}

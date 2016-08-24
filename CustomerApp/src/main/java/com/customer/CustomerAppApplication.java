package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerAppApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "customer-server");
		SpringApplication.run(CustomerAppApplication.class, args);
	}
}

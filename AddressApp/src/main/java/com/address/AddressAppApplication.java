package com.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AddressAppApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "address-server");
		SpringApplication.run(AddressAppApplication.class, args);
	}
}

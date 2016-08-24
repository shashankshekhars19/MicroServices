package com.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulApiCheckApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "registration-server");
		SpringApplication.run(ZuulApiCheckApplication.class, args);
	}
}

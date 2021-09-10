package com.olive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAgEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAgEmployeeServiceApplication.class, args);
	}

}

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WishListManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishListManagementApiApplication.class, args);
	}

}

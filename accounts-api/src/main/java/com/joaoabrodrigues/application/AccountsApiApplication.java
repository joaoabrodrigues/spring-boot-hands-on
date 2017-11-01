package com.joaoabrodrigues.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.joaoabrodrigues.repository")
@SpringBootApplication(scanBasePackages = { "com.joaoabrodrigues.controller", "com.joaoabrodrigues.service"})
public class AccountsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApiApplication.class, args);
	}
}

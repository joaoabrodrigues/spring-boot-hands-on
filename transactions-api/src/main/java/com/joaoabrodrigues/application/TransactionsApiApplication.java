package com.joaoabrodrigues.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "io.pismo.controller")
public class TransactionsApiApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(TransactionsApiApplication.class, args);
	}
}

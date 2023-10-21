package com.demo.pri.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"com.demo.pri"})
public class CustomerRelationshipManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRelationshipManagementSystemApplication.class, args);
	}
}

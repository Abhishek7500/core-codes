package com.cbc.service;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@ComponentScan("com.cbc.service.repo.EmployeeRepo")
public class EmployeeService {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeService.class, args);
		
	}

}

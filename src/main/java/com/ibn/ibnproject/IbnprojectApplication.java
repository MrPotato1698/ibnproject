package com.ibn.ibnproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class IbnprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbnprojectApplication.class, args);
	}

}

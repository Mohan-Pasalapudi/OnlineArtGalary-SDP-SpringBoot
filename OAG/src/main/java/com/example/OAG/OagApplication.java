package com.example.OAG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan("com.example.OAG")
public class OagApplication {

	public static void main(String[] args) {
		SpringApplication.run(OagApplication.class, args);
	}

}

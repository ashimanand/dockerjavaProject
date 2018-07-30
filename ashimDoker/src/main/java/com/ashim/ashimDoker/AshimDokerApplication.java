package com.ashim.ashimDoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ashim"})
public class AshimDokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AshimDokerApplication.class, args);
	}
}

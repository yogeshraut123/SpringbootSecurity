package com.neosoft.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringbootApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApp2Application.class, args);
	}

}

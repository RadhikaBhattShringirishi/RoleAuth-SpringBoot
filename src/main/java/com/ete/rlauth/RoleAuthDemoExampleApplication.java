package com.ete.rlauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class RoleAuthDemoExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleAuthDemoExampleApplication.class, args);
	}

}

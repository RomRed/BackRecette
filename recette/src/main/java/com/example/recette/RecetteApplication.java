package com.example.recette;

import com.example.recette.entity.Role;
import com.example.recette.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class RecetteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecetteApplication.class, args);
	}

@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
@Bean
	CommandLineRunner start(AccountService accountService){
		return args -> {
accountService.addNewRole(new Role("roletest"));
		};
	}

}

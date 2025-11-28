package com.coding.hitesh.module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import com.coding.hitesh.module1.bakery.CakeBaker;

@SpringBootApplication
public class Module1Application {

	public static void main(String[] args) {
		SpringApplication.run(Module1Application.class, args);
	}

	@Bean
	public CommandLineRunner cakeRunner(CakeBaker cakeBaker) {
		return args -> {
			cakeBaker.bakeCake();
		};
	}
}

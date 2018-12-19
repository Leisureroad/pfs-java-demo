package com.example.pfsjavademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class JavaDemoApplication {

	@Bean
	Function<String, String> hello() {
		return f -> "Hello, " + f + "!";
	}

	@Bean
	Function<Double, Double> square() {
		return f -> f*f;
	}

	@Bean
	Function<String, String> uppercase() {
		return f -> f.toUpperCase();
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaDemoApplication.class, args);
	}

}


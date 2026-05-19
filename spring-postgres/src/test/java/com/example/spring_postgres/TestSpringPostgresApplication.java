package com.example.spring_postgres;

import org.springframework.boot.SpringApplication;

public class TestSpringPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringPostgresApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

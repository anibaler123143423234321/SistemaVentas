package com.sistemaventas.chuman.sistemaventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sistemaventas.chuman.sistemaventas.mapper")
public class SistemaventasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaventasApplication.class, args);
	}
}

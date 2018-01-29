package com.advlatam.usuarios.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.advlatam.usuarios.model.Usuario;
import com.advlatam.usuarios.repository.UsuariosRepository;

@SpringBootApplication(scanBasePackages = { "com.advlatam.usuarios.model", "com.advlatam.usuarios.repository",
		"com.advlatam.usuarios.app", "com.advlatam.usuarios.controller" })
@EnableJpaRepositories("com.advlatam.usuarios.repository")
@EntityScan("com.advlatam.usuarios.model")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
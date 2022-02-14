package com.anlix.patients.patientsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Classe responsável pela execução do programa
//Mapeia todos os pacotes e pastas do projeto
@SpringBootApplication
public class PatientsapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientsapiApplication.class, args);
	}
}
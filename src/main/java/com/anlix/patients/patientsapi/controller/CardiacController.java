package com.anlix.patients.patientsapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anlix.patients.patientsapi.entities.CardiacIndex;
import com.anlix.patients.patientsapi.repositories.CardiacIndexRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/patient/cardiac")
@AllArgsConstructor
public class CardiacController {
	
	 CardiacIndexRepository cardiacIndexRepository;
	  
	//Método POST para inserção dos dados na tabela CardiacIndex do banco de dados H2
	 @PostMapping 
	 public ResponseEntity<CardiacIndex> save(@RequestBody List<CardiacIndex> cardiac) { 
		 	cardiacIndexRepository.saveAll(cardiac);
			return new ResponseEntity<>(HttpStatus.CREATED); 
	 }
	 
	 //Método GET de consulta ao banco de dados que retorna todos os dados complementares dos paciente no Banco de Dados
	 @GetMapping
		public ResponseEntity<List<CardiacIndex>> getAll() {
			List<CardiacIndex> cardiac = new ArrayList<>();
			cardiac = cardiacIndexRepository.findAll();
			return new ResponseEntity<>(cardiac, HttpStatus.OK);
		}
	 
	 	//Método GET de consulta ao banco de dados com filtro cpf
		@GetMapping("/{cpf}")
		public ResponseEntity<Optional<CardiacIndex>> getById(@PathVariable String cpf) {
			Optional<CardiacIndex> cardiac;
			try {
				cardiac = cardiacIndexRepository.findById(cpf);
				return new ResponseEntity<Optional<CardiacIndex>>(cardiac, HttpStatus.OK);
			}catch (NoSuchElementException nsee) {
				return new ResponseEntity<Optional<CardiacIndex>>(HttpStatus.NOT_FOUND);
			}
		}
	 
	 	//Método DELETE que deleta todos os dados de indice cardiacao do banco de dados
		@DeleteMapping("/all")
		public ResponseEntity<Optional<CardiacIndex>> deleteAll() {
			try {
				cardiacIndexRepository.deleteAll();
				return new ResponseEntity<Optional<CardiacIndex>>(HttpStatus.OK);
			}catch (NoSuchElementException nsee) {
				return new ResponseEntity<Optional<CardiacIndex>>(HttpStatus.NO_CONTENT);
			}
		}
	 
	 
	 	
}
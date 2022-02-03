package com.anlix.patients.patientsapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	
	private CardiacIndexRepository cardiacIndexRepository;
	
	//Trabalhando aqui 
	@PostMapping(consumes = {"text/plain;charset=UTF-8"})
	public ResponseEntity<CardiacIndex> save(@RequestBody List<CardiacIndex> cardiac) {
		cardiacIndexRepository.saveAll(cardiac);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}

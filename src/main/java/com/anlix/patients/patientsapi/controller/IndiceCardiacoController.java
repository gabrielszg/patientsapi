package com.anlix.patients.patientsapi.controller;

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

import com.anlix.patients.patientsapi.entities.IndiceCardiaco;
import com.anlix.patients.patientsapi.repositories.CardiacoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/patient/cardiaco")
@AllArgsConstructor
public class IndiceCardiacoController {
	
	private CardiacoRepository cardiacoRepository;
	
	@PostMapping
	public ResponseEntity<IndiceCardiaco> save(@RequestBody List<IndiceCardiaco> cardiaco) {
		cardiacoRepository.saveAll(cardiaco);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/{cpf}")
	public ResponseEntity<Optional<IndiceCardiaco>> getById(@PathVariable String cpf) {
		Optional<IndiceCardiaco> cardiacos;
		try {
			cardiacos = cardiacoRepository.findById(cpf);
			return new ResponseEntity<Optional<IndiceCardiaco>>(cardiacos, HttpStatus.OK);
		}catch (NoSuchElementException nsee) {
			return new ResponseEntity<Optional<IndiceCardiaco>>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/all")
	public ResponseEntity<Optional<IndiceCardiaco>> deleteAll() {
		try {
			cardiacoRepository.deleteAll();
			return new ResponseEntity<Optional<IndiceCardiaco>>(HttpStatus.OK);
		}catch (NoSuchElementException nsee) {
			return new ResponseEntity<Optional<IndiceCardiaco>>(HttpStatus.NO_CONTENT);
		}
	}
}

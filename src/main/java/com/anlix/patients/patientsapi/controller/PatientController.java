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

import com.anlix.patients.patientsapi.entities.Patient;
import com.anlix.patients.patientsapi.repositories.PatientRepository;

import lombok.AllArgsConstructor;

//Faz o controle de todos os dados dos pacientes
@RestController
@RequestMapping("/api/patient")
@AllArgsConstructor
public class PatientController {
	
	//Implementação da interface PatientRepository 
	//que extende a interface JpaRepository para utilização de seus métodos
	private PatientRepository patientRepository;
	
	//Método POST para inserção dos dados na tabela Patient do banco de dados H2
	@PostMapping
	public ResponseEntity<Patient> save(@RequestBody List<Patient> patient) {
		patientRepository.saveAll(patient);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	//Método GET de consulta ao banco de dados e
	//retorna todos os dados de todos os pacientes no Banco de Dados
	@GetMapping
	public ResponseEntity<List<Patient>> getAll() {
		List<Patient> patients = new ArrayList<>();
		patients = patientRepository.findAll();
		return new ResponseEntity<>(patients, HttpStatus.OK);
	}
	
	//Método GET de consulta ao banco de dados com filtro de nome, 
	//retornando apenas os dados do devido paciente
	@GetMapping("/{nome}")
	public ResponseEntity<Optional<Patient>> getByNome(@PathVariable String nome) {
		Optional<Patient> patient;
		try {
			patient = patientRepository.findByNomeStartingWith(nome);
			return new ResponseEntity<Optional<Patient>>(patient, HttpStatus.OK);
		}catch (NoSuchElementException nsee) {
			return new ResponseEntity<Optional<Patient>>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Método DELETE que deleta todos os dados de um paciente específico, passando seu CPF
	@DeleteMapping("/{cpf}")
	public ResponseEntity<Optional<Patient>> deleteById(@PathVariable String cpf) {
		try {
			patientRepository.deleteById(cpf);
			return new ResponseEntity<Optional<Patient>>(HttpStatus.OK);
		}catch (NoSuchElementException nsee) {
			return new ResponseEntity<Optional<Patient>>(HttpStatus.NO_CONTENT);
		}
	}
}
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

import com.anlix.patients.patientsapi.entities.PulmonaryIndex;
import com.anlix.patients.patientsapi.repositories.PulmonaryIndexRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/patient/cardiac/pulmonary")
@AllArgsConstructor
public class PulmonaryController {
	
	private PulmonaryIndexRepository pulmonaryIndexRepository;
	
	//Método POST para inserção dos dados na tabela PulmonaryIndex do banco de dados H2
    @PostMapping
    public ResponseEntity<PulmonaryIndex> save(@RequestBody List<PulmonaryIndex> pulmonary) { 
    	pulmonaryIndexRepository.saveAll(pulmonary);
		return new ResponseEntity<>(HttpStatus.CREATED); 
	}
    
    //Método GET de consulta ao banco de dados que retorna todos os dados complementares dos paciente no Banco de Dados
    @GetMapping
    public ResponseEntity<List<PulmonaryIndex>> getAll() {
    	List<PulmonaryIndex> pulmonary = new ArrayList<>();
    	pulmonary = pulmonaryIndexRepository.findAll();
    	return new ResponseEntity<>(pulmonary, HttpStatus.OK);
    }
    
    //Método GET de consulta ao banco de dados com filtro cpf
    @GetMapping("/{cpf}")
	public ResponseEntity<Optional<PulmonaryIndex>> getById(@PathVariable String cpf) {
  		Optional<PulmonaryIndex> pulmonary;
  		try {
  			pulmonary = pulmonaryIndexRepository.findById(cpf);
  			return new ResponseEntity<Optional<PulmonaryIndex>>(pulmonary, HttpStatus.OK);
  		}catch (NoSuchElementException nsee) {
  			return new ResponseEntity<Optional<PulmonaryIndex>>(HttpStatus.NOT_FOUND);
  		}
  	}
    
    //Método DELETE que deleta todos os dados de indice pulmonar do banco de dados
    @DeleteMapping("/all")
  	public ResponseEntity<Optional<PulmonaryIndex>> deleteAll() {
  		try {
  			pulmonaryIndexRepository.deleteAll();
  			return new ResponseEntity<Optional<PulmonaryIndex>>(HttpStatus.OK);
  		}catch (NoSuchElementException nsee) {
  			return new ResponseEntity<Optional<PulmonaryIndex>>(HttpStatus.NO_CONTENT);
  		}
  	}
}
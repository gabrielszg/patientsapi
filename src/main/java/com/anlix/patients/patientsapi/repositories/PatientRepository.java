package com.anlix.patients.patientsapi.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anlix.patients.patientsapi.entities.Patient;

//Interface que extende a interface JpaRepository para utilização de seus métodos em outras classes
public interface PatientRepository extends JpaRepository<Patient, String> {
	
	//Busca pacientes pelo primeiro nome
	Optional<Patient> findByNomeStartingWith(String nome);
	
	@Query("select p from Patient p where p.nome like %?1%")
	List<Patient> findPatientByName(String nome);
}

package com.anlix.patients.patientsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anlix.patients.patientsapi.entities.Patient;

//Interface que extende a interface JpaRepository para utilização de seus métodos em outras classes
public interface PatientRepository extends JpaRepository<Patient, String> {
	
}

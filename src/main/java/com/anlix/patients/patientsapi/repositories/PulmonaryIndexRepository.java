package com.anlix.patients.patientsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anlix.patients.patientsapi.entities.PulmonaryIndex;

public interface PulmonaryIndexRepository extends JpaRepository<PulmonaryIndex, String> {

}

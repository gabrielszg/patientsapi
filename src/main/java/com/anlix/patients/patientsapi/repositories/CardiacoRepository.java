package com.anlix.patients.patientsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anlix.patients.patientsapi.entities.IndiceCardiaco;

public interface CardiacoRepository extends JpaRepository<IndiceCardiaco, String> {

}

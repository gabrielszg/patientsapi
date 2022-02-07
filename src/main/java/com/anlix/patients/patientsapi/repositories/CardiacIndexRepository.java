package com.anlix.patients.patientsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anlix.patients.patientsapi.entities.CardiacIndex;

public interface CardiacIndexRepository extends JpaRepository<CardiacIndex, String> {

}
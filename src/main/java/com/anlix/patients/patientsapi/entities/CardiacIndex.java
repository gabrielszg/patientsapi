package com.anlix.patients.patientsapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardiacIndex {
	
	@Column(name = "data")
	@JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private String data;
	
	@Id
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "epoc")
	private int epoc;
	
	@Column(name = "ind_card")
	private double ind_card;
}
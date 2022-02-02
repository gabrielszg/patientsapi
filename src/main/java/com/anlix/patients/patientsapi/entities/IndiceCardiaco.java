package com.anlix.patients.patientsapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IndiceCardiaco {
	
	@Id
	@Column(name = "data")
	private String data;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "epoc")
	private int epoc;
	
	@Column(name = "ind_card")
	private String ind_card;
}
package com.anlix.patients.patientsapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CardiacIndex{

	@Id
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "epoc")
	private String epoc;
	
	@Column(name = "ind_card")
	private String ind_card;
}

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
public class CardiacIndex {
	
	@Id
	@Column(name = "cpf", length = 14)
	private String cpf;
	
	@Column(name = "epoc", length = 10)
	private Long epoc;
	
	@Column(name = "ind_card", length = 8)
	private String ind_card;
	
	@Column(length = 2)
	private char crlf;
}

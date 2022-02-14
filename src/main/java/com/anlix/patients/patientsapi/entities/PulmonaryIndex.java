package com.anlix.patients.patientsapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Classe com todas as colunas que irão compor a tabela Patient do Banco de Dados H2
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PulmonaryIndex {

	@Column(name = "data")
	@JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private String data;
	
	@Id
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "epoc")
	private int epoc;
	
	@Column(name = "ind_pulm")
	private double ind_pulm;
}

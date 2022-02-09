package com.anlix.patients.patientsapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

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

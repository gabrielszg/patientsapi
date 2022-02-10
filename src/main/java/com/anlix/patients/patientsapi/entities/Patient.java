package com.anlix.patients.patientsapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//Classe com todas as colunas que irão compor a tabela Patient do Banco de Dados H2
@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "idade")
	private int idade;
	
	@Id
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "rg")
	private String rg;
	
	@Column(name = "data_nasc")
	@JsonFormat (shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private String data_nasc;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "signo")
	private String signo;
	
	@Column(name = "mae")
	private String mae;
	
	@Column(name = "pai")
	private String pai;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "cep")
	private String cep;
	
	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "telefone_fixo")
	private String telefone_fixo;
	
	@Column(name = "celular")
	private String celular;
	
	@Column(name = "altura")
	private String altura;
	
	@Column(name = "peso")
	private int peso;
	
	@Column(name = "tipo_sanguineo")
	private String tipo_sanguineo;
	
	@Column(name = "cor")
	private String cor;
	
	@OneToOne(fetch = FetchType.LAZY, optional=true)
	@JoinColumn(name = "cpf")
	private CardiacIndex cardiac;
	
	@OneToOne(fetch = FetchType.LAZY, optional=true)
	@JoinColumn(name = "cpf")
	private PulmonaryIndex pulmonary;
}
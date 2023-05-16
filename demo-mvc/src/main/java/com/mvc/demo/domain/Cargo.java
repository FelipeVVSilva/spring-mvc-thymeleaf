package com.mvc.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CARGOS")
@SuppressWarnings("serial")
public class Cargo extends AbstractEntity<Long>{

	@Column(nullable = false, unique = true, length = 30)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Departamento departamento;

	public Cargo(String nome, Departamento departamento) {
		super();
		this.nome = nome;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
}

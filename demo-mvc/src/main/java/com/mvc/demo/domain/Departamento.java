package com.mvc.demo.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPARTAMENTOS")
@SuppressWarnings("serial")
public class Departamento extends AbstractEntity<Long>{

	@Column(nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos = new ArrayList<Cargo>();

	public Departamento() {
	}
	public Departamento(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Cargo> getCargos() {
		return cargos;
	}
	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
	
}

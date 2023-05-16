package com.mvc.demo.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "FUNNCIONARIOS")
@SuppressWarnings("serial")
public class Funcionario extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false, columnDefinition = "DECIMAL(7,2), DEFAULT 0.00")
	private BigDecimal salario;
	
	@Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@Column(name = "data_saida", columnDefinition = "DATE")
	private LocalDate dataSaida;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_endereco_fk")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name = "id_cargo_fk")
	private Cargo cargo;

	public Funcionario() {
		
	}
	public Funcionario(String name, BigDecimal salario, LocalDate dataEntrada, LocalDate dataSaida, Endereco endereco,
			Cargo cargo) {
		super();
		this.name = name;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.endereco = endereco;
		this.cargo = cargo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public LocalDate getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}

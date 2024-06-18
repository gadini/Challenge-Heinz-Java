package com.github.gadini.challenge_heinz.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "consumos")
public class Consumo extends AbstractEntity<Long>{
	
	@Column(nullable = false)
	private int quantidade;
	
	@Column(nullable = false, columnDefinition = "NUMERIC(15,2)")
	private BigDecimal valor;
	
	@Column(nullable = false, length = 100)
	private String unidade;
	
	@Column(nullable = false, length = 4)
	private String ano;
	
	@Column(nullable = false, length = 50)
	private String mes;
	
	@Column(nullable = false, length = 50)
	private String tipo;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}

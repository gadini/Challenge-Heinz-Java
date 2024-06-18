package com.github.gadini.challenge_heinz.controller.dto;

import java.math.BigDecimal;

import com.github.gadini.challenge_heinz.model.Consumo;

public class FormConsumo {
	
	private Long id;
	private int quantidade;
	private BigDecimal valor;
	private String unidade;
	private String ano;
	private String mes;
	private String tipo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	public FormConsumo toForm(Consumo consumo) {
		this.id = consumo.getId();
		this.quantidade = consumo.getQuantidade();
		this.valor = consumo.getValor();
		this.unidade = consumo.getUnidade();
		this.ano = consumo.getAno();
		this.mes = consumo.getMes();
		this.tipo = consumo.getTipo();
		return this;
	}
	
	public Consumo toModel() {
		Consumo consumo = new Consumo();
		consumo.setId(this.getId());
		consumo.setQuantidade(this.getQuantidade());
		consumo.setValor(this.getValor());
		consumo.setUnidade(this.getUnidade());
		consumo.setAno(this.getAno());
		consumo.setMes(this.getMes());
		consumo.setTipo(this.getTipo());
		return consumo;
	}

}

package com.github.gadini.challenge_heinz.controller.dto;

import java.time.LocalDate;

import com.github.gadini.challenge_heinz.model.Avaliacao;

public class FormAvaliacao {

	private Long id;
	private String nomeUsuario;
	private String origem;
	private String tipo;
	private String esg;
	private String mensagem;
	private LocalDate dataEntrada;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEsg() {
		return esg;
	}
	public void setEsg(String esg) {
		this.esg = esg;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	public FormAvaliacao toForm(Avaliacao avaliacao) {
		this.id = avaliacao.getId();
		this.nomeUsuario = avaliacao.getNomeUsuario();
		this.origem = avaliacao.getOrigem();
		this.tipo = avaliacao.getTipo();
		this.esg = avaliacao.getEsg();
		this.mensagem = avaliacao.getMensagem();
		this.dataEntrada = avaliacao.getDataEntrada();
		return this;
	}
	
	public Avaliacao toModel() {
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setId(this.getId());
		avaliacao.setNomeUsuario(this.getNomeUsuario());
		avaliacao.setOrigem(this.getOrigem());
		avaliacao.setTipo(this.getTipo());
		avaliacao.setEsg(this.getEsg());
		avaliacao.setMensagem(this.getMensagem());
		avaliacao.setDataEntrada(this.getDataEntrada());
		return avaliacao;
	}
	
}

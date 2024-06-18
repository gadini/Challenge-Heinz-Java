package com.github.gadini.challenge_heinz.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "avaliacoes")
public class Avaliacao extends AbstractEntity<Long>{
	
	@Column(nullable = false, length = 100)
	private String nomeUsuario;
	
	@Column(nullable = false, length = 100)
	private String origem;
	
	@Column(nullable = false, length = 100)
	private String tipo;
	
	@Column(nullable = false, length = 100)
	private String esg;
	
	@Column(nullable = false, length = 450)
	private String mensagem;
	
	@Column(columnDefinition = "DATE")
	private LocalDate dataEntrada;

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

}

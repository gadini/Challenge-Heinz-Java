package com.github.gadini.challenge_heinz.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "funcionarios")
public class Funcionario extends AbstractEntity<Long>{
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(nullable = false, length = 100)
	private String sobrenome;
	
	@Column(nullable = false, length = 100)
	private String email;
	
	@Column(nullable = false)
	private Long cpf;
	
	@Column(nullable = false, length = 11)
	private String telefone;
	
	@Column(nullable = false, length = 100)
	private String cor;
	
	@Column(nullable = false, length = 100)
	private String genero;
	
	@Column(nullable = false, length = 100)
	private String estadoCivil;
	
//	@OneToMany(mappedBy = "acao")
//	private List<Acao> acoes;
//	
//	@OneToMany(mappedBy = "meta")
//	private List<Meta> metas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

//	public List<Acao> getAcoes() {
//		return acoes;
//	}
//
//	public void setAcoes(List<Acao> acoes) {
//		this.acoes = acoes;
//	}
//
//	public List<Meta> getMetas() {
//		return metas;
//	}
//
//	public void setMetas(List<Meta> metas) {
//		this.metas = metas;
//	}

}

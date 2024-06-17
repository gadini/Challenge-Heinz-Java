package com.github.gadini.challenge_heinz.controller.dto;

import com.github.gadini.challenge_heinz.model.Funcionario;

public class FormFuncionario {
	
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private Long cpf;
	private String telefone;
	private String cor;
	private String genero;
	private String estadoCivil;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	public FormFuncionario toForm(Funcionario funcionario) {
		this.id = funcionario.getId();
		this.nome = funcionario.getNome();
		this.sobrenome = funcionario.getSobrenome();
		this.email = funcionario.getEmail();
		this.cpf = funcionario.getCpf();
		this.telefone = funcionario.getTelefone();
		this.cor = funcionario.getCor();
		this.genero = funcionario.getGenero();
		this.estadoCivil = funcionario.getEstadoCivil();
		return this;
	}
	
	public Funcionario toModel() {
		Funcionario funcionario = new Funcionario();
		funcionario.setId(this.getId());
		funcionario.setNome(this.getNome());
		funcionario.setSobrenome(this.getSobrenome());
		funcionario.setEmail(this.getEmail());
		funcionario.setCpf(this.getCpf());
		funcionario.setTelefone(this.getTelefone());
		funcionario.setCor(this.getCor());
		funcionario.setGenero(this.getGenero());
		funcionario.setEstadoCivil(this.getEstadoCivil());
		return funcionario;
	}

}

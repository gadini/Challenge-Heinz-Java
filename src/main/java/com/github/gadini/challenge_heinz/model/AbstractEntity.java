package com.github.gadini.challenge_heinz.model;

import java.io.Serializable;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity<ID> implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

}

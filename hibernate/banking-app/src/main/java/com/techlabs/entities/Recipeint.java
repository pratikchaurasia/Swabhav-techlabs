package com.techlabs.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Recipeint {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)", name = "recip_id", unique = true)
	private UUID recipId;

	@ManyToOne
	@JoinColumn
	private Account acc;

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public UUID getRecipId() {
		return recipId;
	}

	public void setRecipId(UUID recipId) {
		this.recipId = recipId;
	}
	
}

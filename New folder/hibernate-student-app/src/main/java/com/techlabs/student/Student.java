package com.techlabs.student;

import java.util.UUID;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
public class Student {

	@Id
	@Column(columnDefinition="BINARY(16)",	name = "id", updatable = false, nullable = false)
	private UUID id;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

}

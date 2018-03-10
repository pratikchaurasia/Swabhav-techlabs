package com.techlab.person;

import java.util.UUID;

public abstract class Person {
	private UUID id;
	private String name;
	private String address;
	private String dateOfBirth;

	public Person(String name, String address, String dateOfBirth) {
		setId();
		setName(name);
		setAddress(address);
		setDateOfBirth(dateOfBirth);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public UUID getId() {
		return id;
	}

	public void setId() {
		this.id = UUID.randomUUID();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
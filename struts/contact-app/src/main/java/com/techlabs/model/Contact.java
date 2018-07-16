package com.techlabs.model;

import java.util.UUID;

public class Contact {
	private String id;
	

	private String name;
	private String email;
	private String number;
	
	public Contact() {
		this.id=UUID.randomUUID().toString();
	}

	public String getName(){
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setName(String name){
		this.name=name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public void setId(String id) {
		this.id = id;
	}
}

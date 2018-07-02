package com.techlabs.contacts.model;

import java.util.UUID;

public class Contact {
	private String id;
	private String name;
	private String email;
	private String number;
	
	public Contact(String name, String email, String number) {
		this.id=UUID.randomUUID().toString();
		this.name = name;
		this.email = email;
		this.number = number;
	}
	public Contact(String id,String name, String email, String number) {
		this.id=id;
		this.name = name;
		this.email = email;
		this.number = number;
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
	
	public String getID() {
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
}

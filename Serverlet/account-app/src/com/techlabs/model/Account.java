package com.techlabs.model;

public class Account {
	private String name;
	private String password;
	private String balance;

	public Account(String name, String password, String amount) {
		this.name = name;
		this.password = password;
		this.balance = amount;
	}

	public String getName() {
		return this.name;
	}

	public String getBalance() {
		return this.balance;
	}

	public String getPassword() {
		return this.password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(String amount) {
		this.balance = amount;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

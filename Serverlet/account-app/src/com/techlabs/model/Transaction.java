package com.techlabs.model;

import java.util.UUID;

public class Transaction {
	private String name;
	private String amount;
	private String type;
	private String date;

	public Transaction(String name, String amount, String type, String date) {
		this.name = name;
		this.amount=amount;
		this.type = type;
		this.date = date;
	}
	public String getName() {
		return this.name;
	}

	public String getAmount() {
		return this.amount;
	}

	public String getType() {
		return this.type;
	}

	public String getDate() {
		return this.date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(String amount) {
		this.amount=amount;
	}

	public void setType(String type) {
		this.type=type;
	}

	public void setDate(String date) {
		this.date=date;
	}
}

package com.techlabs.entity;


import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)", name = "trans_id", unique = true )
	private UUID transId;
	private double amount;
	private String type;
	private Date date;
	
	@ManyToOne
	@JoinColumn
	private Account acc;

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public UUID getTransId() {
		return transId;
	}

	public void setTransId(UUID transId) {
		this.transId = transId;
	}

	public double getAmount() {
		return this.amount;
	}

	public String getType() {
		return this.type;
	}

	public Date getDate() {
		return this.date;
	}

	public void setAmount(double amount) {
		this.amount=amount;
	}

	public void setType(String type) {
		this.type=type;
	}

	public void setDate(Date date) {
		this.date=date;
	}
}

package com.techlabs.entities;

import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Account {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)", name = "acc_id", unique = true)
	private UUID accountId;
	private double balance;
	private String type;

	@OneToMany(mappedBy = "acc", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Transaction> transactions;
	
	@OneToMany(mappedBy = "acc", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Recipeint> recipeint;
	
	public Set<Recipeint> getRecipeint() {
		return recipeint;
	}

	public void setRecipeint(Set<Recipeint> recipeint) {
		this.recipeint = recipeint;
	}

	@ManyToOne
	@JoinColumn
	private User user;
	// private Character role;

	public UUID getAccountId() {
		return accountId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setAccountId(UUID accountId) {
		this.accountId = accountId;
	}

	public Set<Transaction> getTransaction() {
		return transactions;
	}

	public void setTransaction(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double amount) {
		this.balance = amount;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public void withdrawl(double amount) throws Exception {
		if (balance - amount > 1500) {
			this.balance = this.balance - amount;
		}else{
			throw new Exception("Low Balance");
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

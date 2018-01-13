package com.techlabs.account;

public class CurrentAccount extends Account {
	private static final double OVERDRAFT = -5000.0;
	public CurrentAccount(String name, double balance) {
		super(name, balance);
	}

	public void withdraw(int amount) {
		if (balance - amount > OVERDRAFT) {
			balance = balance - amount;
		}
	
	}
}

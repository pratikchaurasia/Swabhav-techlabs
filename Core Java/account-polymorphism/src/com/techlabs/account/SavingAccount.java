package com.techlabs.account;

public class SavingAccount extends Account {

	private static final double MINIMUM_BAl = 500.0;

	public SavingAccount(String name, int balance) {
		super(name, balance);

	}

	@Override
	public void withdraw(int amount) {
		if (balance - amount > MINIMUM_BAl) {
			balance = balance - amount;
		}

	}
}
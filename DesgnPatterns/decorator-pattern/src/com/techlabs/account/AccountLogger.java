package com.techlabs.account;

public class AccountLogger implements IAccountable {

	private IAccountable account;
	public AccountLogger(IAccountable acc) {
		this.account=acc;
	}
	@Override
	public void deposit(int value) {
		System.out.println("Before Deposit");
		account.deposit(value);
		System.out.println("After Deposit");
	}

	@Override
	public void withdraw(int value) {
		System.out.println("Before Deposit");
		account.withdraw(value);
		System.out.println("After Deposit");
	}
	

}

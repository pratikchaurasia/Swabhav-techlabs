package com.techlabs.account;

public class Account {
	private final int accountNumber;
	private final String name;
	private double balance;

	private static int count = 0;
	private static int noOfDeposits = 0;
	private static int noOfWithdrawls = 0;
	private static final double MINIMUM_BAl = 500.0;

	public Account(int accountNo, String name, double balance) {
		this.accountNumber = accountNo;
		this.name = name;
		this.balance = balance;
		count++;
		System.out.println("Inside the Constructor");
	}

	static {
		count = 100;
		System.out.println("Inside the static block");
	}

	public Account(int accountNo, String name) {
		this(accountNo, name, MINIMUM_BAl);

	}

	public void deposit(double amount) {
		balance = balance + amount;
		noOfDeposits++;
	}

	public void withdraw(double amount) {
		if (balance - amount > MINIMUM_BAl) {
			balance = balance - amount;
			noOfWithdrawls++;
		} else {
			throw new InsufficientFundException(this, amount);
		}
	}

	public int getAccNo() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getCount() {
		return count;
	}

	public static int getHeadCount() {
		return count;
	}

	public static int getNoOfDeposits() {
		return noOfDeposits;
	}

	public static int getNoOfWithdraws() {
		return noOfWithdrawls;
	}
}

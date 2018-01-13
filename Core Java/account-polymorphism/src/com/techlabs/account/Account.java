package com.techlabs.account;

public abstract class Account {
	protected static int accountNoGenerator;
	private String name;
	protected double balance;
	private int accountNo;
	
	static{
		accountNoGenerator=10000;
	}
	
	public Account(String name,double bal){
		accountNoGenerator++;
		this.name=name;
		balance=bal;
		accountNo=accountNoGenerator;
		
	}
	public void deposit(int amount){
		balance=balance+amount;
	}
	public abstract void withdraw(int amount);
	public  int getAccNo(){
		return accountNo;
	}
	
	

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
}

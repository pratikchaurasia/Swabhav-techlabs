package com.techlabs.account;

import java.util.ArrayList;


public class Account implements IAccountable{
	private int id;
	private String name;
	private int amount;
	private String mobileNo;
	private String email;


	public Account(int id, String name, int amount, String mobileNo,String email) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.mobileNo = mobileNo;
		this.email = email;
	}


	@Override
	public void deposit(int value) {
		this.amount=this.amount+value;
		System.out.println("Amount is : "+amount);
	}


	@Override
	public void withdraw(int value) {
		this.amount=this.amount-value;
	}
}


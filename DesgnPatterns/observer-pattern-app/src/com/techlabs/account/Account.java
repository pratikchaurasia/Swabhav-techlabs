package com.techlabs.account;

import java.util.ArrayList;

import com.techlabs.listner.IAccountListener;

public class Account {
	private int id;
	private String name;
	private int amount;
	private String mobileNo;
	private String email;
	private ArrayList<IAccountListener> listner = new ArrayList<IAccountListener>();

	public Account(int id, String name, int amount, String mobileNo,
			String email) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	public void deposit(int amount) {
		this.amount = this.amount + amount;
		this.notifyAccount();
	}

	public void withdraw(int amount) {
		this.amount = this.amount - amount;
		this.notifyAccount();
	}

	private void notifyAccount() {
		for (IAccountListener accountListener : listner) {
			accountListener.balanceChanged(this);
		}
	}

	public int getAmount() {
		return amount;
	}

	public void addListner(IAccountListener accountListner) {
		listner.add(accountListner);

	}

}

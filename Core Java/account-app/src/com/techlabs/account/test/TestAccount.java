package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestAccount {
	public static void main(String args[]) {
		Account acc1 = new Account(100, "Pratik", 1000);
		Account acc2 = new Account(101, "Krishna");
		acc1.withdraw(300);
		acc2.withdraw(100);
		acc1.getCount();
		acc2.getCount();
		printDetails(acc1);
		printDetails(acc2);
	}

	static void printDetails(Account acc) {
		System.out.println("Account Details ");
		System.out.println("Account No : " + acc.getAccNo()
				+ "\nName of Account Holder : " + acc.getName() + "\nBalance :"
				+ acc.getBalance()+"\nNo of Account :"+acc.getCount()+"Head Count"+Account.getHeadCount());

	}
}

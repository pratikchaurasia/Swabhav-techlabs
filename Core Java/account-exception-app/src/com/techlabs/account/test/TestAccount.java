package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestAccount {
	public static void main(String args[]) {
		Account acc1 = new Account(100, "Pratik", 1000);
		Account acc2 = new Account(101, "Krishna");
		acc1.withdraw(300);
		acc1.withdraw(100);
		printDetails(acc1);
		
		try {
			acc2.withdraw(100);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		printDetails(acc2);
	}

	static void printDetails(Account acc) {
		System.out.println("Account Details ");
		System.out.println("Account No : " + acc.getAccNo()
				+ "\nName of Account Holder : " + acc.getName() + "\nBalance :"
				+ acc.getBalance() + "\nNo of Account :" + acc.getCount()
				+ "\nHead Count" + Account.getHeadCount()
				+ "\nNo of deposits : " + Account.getNoOfDeposits()
				+ "\nNo of Withdrawls : " + Account.getNoOfWithdraws());

	}
}

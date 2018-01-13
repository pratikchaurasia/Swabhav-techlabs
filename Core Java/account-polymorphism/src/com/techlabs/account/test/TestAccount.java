package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class TestAccount {
	public static void main(String args[]) {
		SavingAccount sa=new SavingAccount("Pratik", 1000);
		CurrentAccount ca=new CurrentAccount("Krishna", 2000);
		
		printDetails(sa);
		printDetails(ca);
		
		sa.withdraw(200);
		ca.withdraw(3000);
		
		printDetails(sa);
		printDetails(ca);
	}
	public static void printDetails(Account acc){
		System.out.println("Account Number :"+acc.getAccNo());
		System.out.println("Account Holder Name :"+acc.getName());
		System.out.println("Balance :"+acc.getBalance());
	}
}

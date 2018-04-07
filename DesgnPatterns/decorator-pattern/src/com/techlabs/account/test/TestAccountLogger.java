package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.AccountLogger;
import com.techlabs.account.IAccountable;

public class TestAccountLogger {
	public static void main(String args[]){
		IAccountable logger = new AccountLogger(new Account(100, "Pratik", 4000, "7507587701", "pratik@gmail.com"));
		logger.deposit(100);
	}
}

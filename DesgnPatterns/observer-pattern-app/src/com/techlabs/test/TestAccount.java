package com.techlabs.test;

import com.techlabs.account.Account;
import com.techlabs.listner.EmailAccountListner;
import com.techlabs.listner.SmsAccountListner;

public class TestAccount {
	public static void main(String args[]){
		Account acc1=new Account(100, "pratik", 1000, "7507587701", "abc@gmail.com");
		SmsAccountListner smsListner = new SmsAccountListner();
		EmailAccountListner emailListner = new EmailAccountListner();
		
		acc1.addListner(smsListner);
		acc1.addListner(emailListner);
		
		acc1.deposit(100);
		
	}
}

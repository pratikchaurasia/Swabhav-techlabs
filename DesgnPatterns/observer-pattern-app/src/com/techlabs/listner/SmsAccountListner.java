package com.techlabs.listner;

import com.techlabs.account.Account;

public class SmsAccountListner implements IAccountListener{

	@Override
	public void balanceChanged(Account account) {
		System.out.println("Sms alert Amount changed to "+account.getAmount());
		
	}



}

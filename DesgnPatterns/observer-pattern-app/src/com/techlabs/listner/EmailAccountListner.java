package com.techlabs.listner;

import com.techlabs.account.Account;

public class EmailAccountListner implements IAccountListener{

	@Override
	public void balanceChanged(Account account) {
		System.out.println("Email alert Amount changed to "+account.getAmount());
	}



}

package com.techlabs.model;


import java.io.IOException;
import java.sql.SQLException;

import db.repository.BankRepository;

public class AccountService {
		BankRepository repo=new BankRepository();

		public Boolean addNewAccount(String name,String password,String repassword,String amount) throws Exception{
		if (repassword.equals(password)){
				System.out.println("inside service");
			Account acc=new Account(name, password, amount);
			String type="D";
			repo.newAccount(acc);
			return true;
			}
			return false;
			
		}
}

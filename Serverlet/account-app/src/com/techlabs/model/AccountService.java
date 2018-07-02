package com.techlabs.model;


import db.repository.BankRepository;

public class AccountService {
		BankRepository repo=new BankRepository();

		public Boolean addNewAccount(String name,String password,String repassword,String amount){
			if(repassword.equals(password)){
				System.out.println("inside service");
			Account acc=new Account(name, password, amount);
			repo.newAccount(acc);
			return true;
			}
			return false;
		}
}

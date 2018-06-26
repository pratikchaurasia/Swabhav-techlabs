package com.techlabs.contacts.model;

import java.util.ArrayList;

public class LoginService {
	private String userName="pratik";
	private String password="123";
	
	private static LoginService service;

	static {
		service = new LoginService();
	}

	public static LoginService getInstance() {
		return service;
	}

	public LoginService() {
		
	}

	
	public Boolean checkLogin(String userName,String password){
		if(userName.equals(this.userName)&&(password.equals(this.password)))
			return true;
		return false;
	}
	
}

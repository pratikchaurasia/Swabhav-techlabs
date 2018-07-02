package com.techlabs.contacts.model;
import java.util.HashMap;
import java.util.Map;

import db.repository.LoginRepository;

public class LoginService {
	private Map<String, String> users;
	
	private static LoginService service;

	static {
		service = new LoginService();
	}



	public LoginService() {
		users = new HashMap<String, String>();
		//addUser("pratik", "123");
	}

	public static LoginService getInstance() {
		if (service == null) {
			service = new LoginService();
		}
		return service;
	}


	
	public void addUser(String name, String password) {
		users.put(name, password);
	}
	
	public boolean checkUser(String name, String password) {
		LoginRepository repo=new LoginRepository();
		users=repo.getCredential();
		for(Map.Entry<String, String> entry : users.entrySet()) {
			if(name.equals(entry.getKey()) && password.equals(entry.getValue())){
				return true;
			}
		}
		return false;
	}
	
}

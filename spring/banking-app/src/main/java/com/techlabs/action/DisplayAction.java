package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.User;
import com.techlabs.service.AccountService;

public class DisplayAction implements ModelDriven<User> {
	@Autowired
	private AccountService service;
	
	private User user;
	public String execute() {

		return "success";
	}

	@Override
	public User getModel() {
		user = new User();
		return user;
	}

}

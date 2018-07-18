package com.techlabs.action;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.User;
import com.techlabs.service.AccountService;

public class AdminPortalAction implements Action{
	@Autowired
	private AccountService service;
	
	private List<User> users;
	
	
	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	@Override
	public String execute(){
		setUsers(service.getUsers());
		System.out.println(users);
		return "success";	
	}
	

	
}

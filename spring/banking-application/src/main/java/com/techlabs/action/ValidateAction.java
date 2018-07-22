package com.techlabs.action;

import java.util.UUID;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.AccountService;

public class ValidateAction implements Action{
	@Autowired
	private AccountService service;

	@Override
	public String execute() throws Exception {
		String id = ServletActionContext.getRequest().getParameter("id");
		UUID uid=UUID.fromString(id);
		
		service.validateUser(uid);
		return "success";
	}
	

}

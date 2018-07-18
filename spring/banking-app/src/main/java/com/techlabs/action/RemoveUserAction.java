package com.techlabs.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.AccountService;

public class RemoveUserAction implements Action{
	@Autowired
	private AccountService service;

	@Override
	public String execute() throws Exception {
		String id=ServletActionContext.getRequest().getParameter("id");
		service.remove(id);
		return "success";
	}
	
}

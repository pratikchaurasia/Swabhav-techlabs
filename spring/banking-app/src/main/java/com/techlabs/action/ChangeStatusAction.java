package com.techlabs.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.AccountService;

public class ChangeStatusAction implements Action{
	@Autowired
	private AccountService service;

	@Override
	public String execute() throws Exception {
		String id= ServletActionContext.getRequest().getParameter("id");
		System.out.println(id);
		service.changeStatus(id);
		return "success";
	}

}

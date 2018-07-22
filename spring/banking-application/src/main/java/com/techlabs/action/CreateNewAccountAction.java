package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Account;
import com.techlabs.service.AccountService;

public class CreateNewAccountAction implements SessionAware,ModelDriven<Account>{
	private Map<String, Object> userSession;
	private Account acc;
	@Autowired
	private AccountService service;
	
	public String execute(){
		return "success";
	}
	public String create(){
		String type = ServletActionContext.getRequest().getParameter("type");
		acc.setType(type);
		String firstName = (String) userSession.get("userName");
		service.createNewAccount(acc,firstName);
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession=session;
		
	}

	@Override
	public Account getModel() {
		acc=new Account();
		return acc;
	}

}

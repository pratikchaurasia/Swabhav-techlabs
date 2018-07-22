package com.techlabs.action;

import java.util.Map;
import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.entity.Transaction;
import com.techlabs.service.AccountService;

public class PassbookAction implements SessionAware,Action{
	@Autowired
	private AccountService service;
	private Map<String, Object> userSession;
	private Set<Transaction> transactions;

	private Transaction transaction;

	public String execute() {
		
		return "success";
	}

	public String passbook() {
		String firstName = (String) userSession.get("userName");
		String accountType = ServletActionContext.getRequest().getParameter(
				"type");
		transactions=service.passbook(firstName,accountType);
		System.out.println(transactions.size());
		
		return "success";
	}

	

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
	}

	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

}

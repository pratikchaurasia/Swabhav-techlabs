package com.techlabs.action;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Account;
import com.techlabs.entity.Transaction;
import com.techlabs.entity.User;
import com.techlabs.service.AccountService;

public class PassbookAction implements SessionAware,Action {
	@Autowired
	private AccountService service;
	private Map<String, Object> userSession;
	private Set<Transaction> transactions;

	private Transaction transaction;

	public String execute() {
		String firstName = (String) userSession.get("userName");
		transactions = service.passbook(firstName);
		return "success";
	}

	public String passbook() {
		String firstName = ServletActionContext.getRequest().getParameter(
				"name");
		userSession.put("transactions", service.passbook(firstName));
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

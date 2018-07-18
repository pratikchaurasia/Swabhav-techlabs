package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.AccountService;

public class TransactionAction extends ActionSupport implements SessionAware {
	private Map<String, Object> userSession;
	@Autowired
	private AccountService service;
	private String type;
	private double amount;

	public String execute() {
		return "success";
	}

	@Override
	public void validate() {

		type = ServletActionContext.getRequest().getParameter("type");
		amount = Double.parseDouble(ServletActionContext.getRequest()
				.getParameter("amount"));
		String firstName = (String) userSession.get("userName");
		if (!service.makeTransaction(firstName, type, amount)) {
			addFieldError("message", "Low Balance... Transaction Aborted");
		}
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
	}

}

package com.techlabs.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.User;
import com.techlabs.service.AccountService;

public class RegisterAction extends ActionSupport implements ModelDriven<User>{

	@Autowired
	private AccountService service;
	private Double balance;

	private User user;

	public String execute() {

		return "success";
	}

	public String register() {
		service.addNewAccount(user, getBalance());
		return "success";
	}

	@Override
	public User getModel() {
		user = new User();
		return user;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public void validate() {
		String gRecaptchaResponse = ServletActionContext.getRequest()
				.getParameter("g-recaptcha-response");
		boolean verify = service.verifyCaptcha(gRecaptchaResponse);
		if (!verify) {
			addFieldError("message", "Ooops you missed the Captcha !");
		}
	}

}

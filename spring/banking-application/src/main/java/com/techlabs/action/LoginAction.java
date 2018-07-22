package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.AccountService;

public class LoginAction extends ActionSupport implements SessionAware {
	String name, password;
	private Map<String, Object> userSession;

	@Autowired
	private AccountService service;

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
	}

	public String execute() {
		userSession.put("login", "true");
		userSession.put("userName", name);
		
		return "success";
	}

	public String logout() {
		userSession.clear();
		return "success";
	}

	@Override
	public void validate() {
		if (userSession.isEmpty()) {
			name = ServletActionContext.getRequest().getParameter("name");
			password = ServletActionContext.getRequest().getParameter(
					"password");
			
			if(service.checkValidUser(name,password)){
				addFieldError("password",
						"Account not yet validaated !");
			}
			if (service.checkUser(name, password)) {
				if (service.checkLocked(name)) {
					addFieldError("password",
							"Ooops your Account seems to be to be Locked !");
				}
			} else {
				if(!service.checkAttempts(name)){
					addFieldError("password",
							"Too many Falied Attempts..!!! Your Account is Locked ");
				}else{
				addFieldError("password",
						"Either Username or password is wrong");
				}
			}

		}

	}

}

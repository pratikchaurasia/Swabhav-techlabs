package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Contact;
import com.techlabs.model.ContactService;

public class AddAction implements ModelDriven<Contact>,SessionAware{
	private Map<String, Object> userSession;
	
	private Contact contact=new Contact();
	private ContactService service =ContactService.getInstance();

	public String execute() throws Exception {
	if(userSession.isEmpty()){
		System.out.println("true");
		return "login";
	}
	return "success";
	}
	
	public String executeadd() {
		service.addContact(contact);
		return "success";
	}

	@Override
	public Contact getModel() {
		return contact;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession=session;
	}
	

}

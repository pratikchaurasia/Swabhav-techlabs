package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Contact;
import com.techlabs.model.ContactService;

public class EditAction implements ModelDriven<Contact>, SessionAware{
	private Map<String, Object> userSession;
	private ContactService service=ContactService.getInstance();
	private String id ;
	Contact contact;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		System.out.println(id);
	}

	public String execute() throws Exception {
		if(userSession.isEmpty()){
			return "login";
		}
		return "success";
		
	}
	
	public String edit(){
		System.out.println("inside");
		service.editContact(contact.getId(),contact.getName(),contact.getEmail(),contact.getNumber());
		return "success";
	}

	@Override
	public Contact getModel() {
		id= ServletActionContext.getRequest().getParameter("id");
		contact=service.getByID(id);
		return contact;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession=session;
		
	}
	
	
	
}

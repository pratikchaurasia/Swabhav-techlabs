package com.techlabs.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Contact;
import com.techlabs.model.ContactService;


public class DisplayAction implements Action{
	private List<Contact> contactList;

	@Override
	public String execute() throws Exception {
		ContactService service=ContactService.getInstance();
		contactList=service.getContacts();
		return this.SUCCESS;
	}

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	

}

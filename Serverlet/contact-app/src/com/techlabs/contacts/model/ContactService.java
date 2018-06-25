package com.techlabs.contacts.model;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	private List<Contact> contactList;
	
	public ContactService() {
		contactList = new ArrayList<Contact>();
	}
	
	public List<Contact> getContacts(){
		if(!(contactList.isEmpty())){
			return contactList;
		}
		return null;
	}
	
	public void addContact(String name,String email,String number) {
		contactList.add(new Contact(name,email,number));
	}
}

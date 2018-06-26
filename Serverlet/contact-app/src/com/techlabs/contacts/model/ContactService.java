package com.techlabs.contacts.model;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	private List<Contact> contactList;

	private static ContactService service;

	static {
		service = new ContactService();
	}

	public static ContactService getInstance() {
		return service;
	}

	public ContactService() {
		contactList = new ArrayList<Contact>();
		// contactList.add(new
		// Contact("pratik","pratik@gmail.com","7507587701"));

	}

	public List<Contact> getContacts() {
		if (!(contactList.isEmpty())) {
			return contactList;
		}
		return null;
	}

	public void addContact(String name, String email, String number) {
		contactList.add(new Contact(name, email, number));
	}

	public void EditContact(String id, String name, String email, String number) {
		// TODO Auto-generated method stub

		Contact contact = getByID(id);
		contact.setName(name);
		contact.setEmail(email);
		contact.setNumber(number);
	}

	public Contact getByID(String id) {
		
		for (Contact contact : contactList) {
			if (id.equals(contact.getID())) {
				//System.out.println(id);
				return contact;
			}
		}
		return null;
	}
}

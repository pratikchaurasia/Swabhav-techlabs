package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
		//contactList.add(newContact("pratik","pratik@gmail.com","7507587701"));
		//System.out.println(contactList.size());

	}

	public List<Contact> getContacts() {
		if (!(contactList.isEmpty())) {
			return contactList;
		}
		return null;
	}

	public void addContact(Contact contact) {
		//contact.setId(UUID.randomUUID().toString());
		contactList.add(contact);
	}

	public void editContact(String id,String name,String email,String number) {
		// TODO Auto-generated method stub

		Contact contact = getByID(id);
		contact.setName(name);
		contact.setEmail(email);
		contact.setNumber(number);
	}

	public Contact getByID(String id) {
		
		for (Contact contact : contactList) {
			if (id.equals(contact.getId())) {
				//System.out.println(id);
				return contact;
			}
		}
		return null;
	}
}

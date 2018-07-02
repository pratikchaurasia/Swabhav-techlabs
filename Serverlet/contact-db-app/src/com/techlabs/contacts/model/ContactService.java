package com.techlabs.contacts.model;

import java.util.ArrayList;
import java.util.List;

import db.repository.Repository;


public class ContactService {
	private List<Contact> contactList;
	Repository repo=new Repository();

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
		
		contactList=repo.display();
		if (!(contactList.isEmpty())) {
			return contactList;
		}
		return null;
	}
	public void showContacts(){
		Repository repo=new Repository();
		repo.display();
	}

	public void addContact(String name, String email, String number) {
		Contact contact=new Contact(name, email, number);
		repo.add(contact);
		
	}

	public void EditContact(String id, String name, String email, String number) {
		// TODO Auto-generated method stub
		repo.edit(id, name, email, number);
	}
	


	public Contact getByID(String id) {
		// TODO Auto-generated method stub
		Contact contact=repo.getContact(id);
		return contact;
	}
}

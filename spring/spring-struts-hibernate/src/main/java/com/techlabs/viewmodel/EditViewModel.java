package com.techlabs.viewmodel;

import org.apache.struts2.ServletActionContext;

public class EditViewModel {
	private String firstName;
	private String lastName;
	private String address;
	private int rollNo=Integer.parseInt(ServletActionContext.getRequest().getParameter("rollNo"));
	
	public int getRollNo() {
		return this.rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

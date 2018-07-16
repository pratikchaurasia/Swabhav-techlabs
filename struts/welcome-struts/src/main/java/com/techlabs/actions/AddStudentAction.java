package com.techlabs.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class AddStudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name, address;
	private ContactService service = ContactService.getInstance();
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		
		this.student = student;
	}

	// @Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}

	public String executeAdd() throws Exception {
		//System.out.println(rollNo + name + address);
		service.add(student);
		return this.SUCCESS;
	}

	
	@Override
	public void validate() {
		System.out.println("inside validate");
		System.out.println(student.getId());
		if (student.getId()==0) {
			addFieldError("student.id", "The Roll no is required");
		}
		if (student.getName().isEmpty()) {
			addFieldError("student.name", "The name is required");
		}
		
		if (student.getAddress().isEmpty()) {
			addFieldError("student.address", "The Address is required");
		}
	}

}

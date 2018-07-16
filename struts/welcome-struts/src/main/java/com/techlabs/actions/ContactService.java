package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	private static List<Student> studentList;
	private static ContactService service;
	
	static {
		service = new ContactService();
	}

	public static ContactService getInstance() {
		return service;
	}

	public ContactService() {
		studentList = new ArrayList<Student>();
		//studentList.add(new Student(101, "pratik", "vasai"));
		//studentList.add(new Student(102, "Ankit", "vasai"));
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList() {
		this.studentList = studentList;
	}
	
	public void add(Student student) {
		System.out.println("inside add");
		//System.out.println(rollNo+name+address);
		studentList.add(student);
		
	}
}

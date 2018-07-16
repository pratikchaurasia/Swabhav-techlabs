package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;

public class AddStudentAction implements ModelDriven<Student>{
	private Student student=new Student();

	@Autowired
	private StudentService service;
	
	public String execute(){
		return "success";
		
	}
	public String add(){
		service.addStudent(student);
		return "success";
	}
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public Student getModel() {
		
		return student;
	}
	


}

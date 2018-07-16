package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;
import com.techlabs.viewmodel.StudentViewModel;

public class StudentAction implements ModelDriven<StudentViewModel>{
	private StudentViewModel display=new StudentViewModel();

	@Autowired
	private StudentService service;
	
	public String execute(){
		display.setStudentList(service.getStudents());
		return "success";
		
	}
	
	@Override
	public StudentViewModel getModel() {
		return display;
	}

}

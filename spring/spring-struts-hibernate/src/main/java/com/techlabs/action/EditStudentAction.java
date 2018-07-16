package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewmodel.EditViewModel;

public class EditStudentAction implements ModelDriven<EditViewModel>{
	private EditViewModel model=new EditViewModel();
	@Autowired
	private StudentService service;
	
	public String execute(){
		return "success";
		
	}
	
	public EditStudentAction(){
		super();
	}
	public String edit(){
		service.editStudentDetails(model.getRollNo(), model.getFirstName(), model.getLastName(), model.getAddress());
		return "success";
	}
	@Override
	public EditViewModel getModel() {
		Student student=service.getById(model.getRollNo());
		model.setFirstName(student.getFirstName());
		model.setLastName(student.getLastName());
		model.setAddress(student.getAddress());
		return model;
	}

}

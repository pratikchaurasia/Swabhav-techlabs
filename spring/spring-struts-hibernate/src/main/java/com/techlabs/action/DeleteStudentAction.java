package com.techlabs.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.techlabs.service.StudentService;

public class DeleteStudentAction {
	@Autowired
	private StudentService service;
	private int rollNo=Integer.parseInt(ServletActionContext.getRequest().getParameter("rollNo"));
	
	public String execute(){
		service.deleteStudent(rollNo);
		return "success";
	}

}

package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

public class StudentsAction implements Action{
	static private List<Student> studentList=new ArrayList<>();
	
	@Override
	public String execute() throws Exception {
		
		ContactService service=ContactService.getInstance();
		studentList=service.getStudentList();
		return this.SUCCESS;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	

}

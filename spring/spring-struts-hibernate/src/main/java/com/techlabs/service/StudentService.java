package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.techlabs.entity.Student;
import com.techlabs.repository.StudentRepository;

@Service("studentSVC")
public class StudentService {
	@Autowired
	private StudentRepository repo=null;
	
	public StudentService(){
		System.out.println("Service Created");
	}
	
	public List<Student> getStudents(){
		return this.repo.get();
	}
	public void addStudent(Student student){
		this.repo.add(student);
	}
	public void editStudentDetails(int rollNo,String firstName,String lastName,String Address) {
		this.repo.edit(rollNo, firstName, lastName, Address);
	}
	public Student getById(int rollNo){
		return this.repo.getById(rollNo);
	}

	public void deleteStudent(int rollNo) {
		this.repo.delete(rollNo);
		
	}

}

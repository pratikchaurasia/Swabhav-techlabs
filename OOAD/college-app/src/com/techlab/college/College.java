package com.techlab.college;

import java.util.ArrayList;

import com.techlab.proffesor.Professor;
import com.techlab.student.Student;

public class College {
	ArrayList<Student> studentList = new ArrayList<Student>();
	ArrayList<Professor> professorList = new ArrayList<Professor>();

	public void addStudent(Student student) {
		studentList.add(student);
	}

	public ArrayList<Student> getAllStudents() {
		return studentList;
	}

	public void addProfessor(Professor professor) {
		professorList.add(professor);
	}

	public ArrayList<Professor> getAllProfessors() {
		return professorList;
	}

}
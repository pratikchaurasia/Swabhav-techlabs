package com.techlabs.student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.techlabs.student.deserialize.StudentDeSerialize;
import com.techlabs.student.serialize.StudentSerialize;

public class StudentDataStore {
	private ArrayList<Student> studentRecord = new ArrayList<Student>();
	StudentSerialize serialize = new StudentSerialize();
	StudentDeSerialize deSerialize = new StudentDeSerialize();

	public void add(Student student) {
		studentRecord.add(student);
	}

	public ArrayList<Student> getList() {
		return studentRecord;
	}

	public void save() throws FileNotFoundException, IOException {
		serialize.serializeObject(studentRecord);
	}

	public ArrayList<Student> fetch() throws FileNotFoundException,
			ClassNotFoundException, IOException {
		studentRecord = deSerialize.deserializeObject();
		if (studentRecord == null) {
			studentRecord = new ArrayList<Student>();
		}
		return studentRecord;
	}

	public Iterable<Student> search(String key) {
		ArrayList<Student> searchResult = new ArrayList<Student>();
		for (Student student : studentRecord) {
			if (student.getfName().contains(key)) {
				searchResult.add(student);
			}
		}
		return searchResult;
	}

	public void removeStudent(String id) {
		for (Student stud : studentRecord) {
			if (search(id)!=null) {
				studentRecord.remove(stud);
				return;
			}
		}
		System.out.println("No such student found");
	}
}

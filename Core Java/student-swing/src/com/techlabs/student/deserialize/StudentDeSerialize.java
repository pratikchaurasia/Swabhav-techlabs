package com.techlabs.student.deserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import com.techlabs.student.Student;
import com.techlabs.student.StudentDataStore;
import com.techlabs.student.serialize.StudentSerialize;

public class StudentDeSerialize implements Serializable {
	ArrayList<Student> studentRecord;
	
	@SuppressWarnings("unchecked")
	public ArrayList<Student> deserializeObject()throws FileNotFoundException, IOException, ClassNotFoundException {
		try{
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(
				"foo.txt"));
		studentRecord = (ArrayList<Student>) input.readObject();
		input.close();
		return studentRecord;
		}
		catch(Exception e){
			return studentRecord;
		}
		
	}
}

package com.techlabs.student.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import com.techlabs.student.Student;
import com.techlabs.student.StudentDataStore;

public class StudentSerialize implements Serializable{
	public void serializeObject(ArrayList<Student> studentRecord) throws IOException, FileNotFoundException {
		FileOutputStream fileOutput = new FileOutputStream("foo.txt");
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
		objectOutput.writeObject(studentRecord);
		objectOutput.close();
	}
}

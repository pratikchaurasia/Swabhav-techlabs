package com.techlabs.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class StudentStore implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fName, lName, address;
	public void setFName(String firstName) {
		fName = firstName;
	}

	public void setLName(String lastName) {
		lName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getAddress() {
		return address;
	}
	
	public void serializeObject(ArrayList<StudentStore> studentRecord) throws IOException, FileNotFoundException {
		FileOutputStream fileOutput = new FileOutputStream("foo.txt");
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
		objectOutput.writeObject(studentRecord);
		objectOutput.close();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentStore> deserializeObject(ArrayList<StudentStore> studentRecord) throws FileNotFoundException, IOException,
			ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(
				"foo.txt"));
		studentRecord = (ArrayList<StudentStore>) input.readObject();
		input.close();
		return studentRecord;

	}

}

package com.techlabs.exercise;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestBoxDeserialization {
	public static void main(String args[]) {
		try{
		ObjectInputStream input=new ObjectInputStream(new FileInputStream("foo.ser"));
		Box box=(Box) input.readObject();
		
		box.print();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}

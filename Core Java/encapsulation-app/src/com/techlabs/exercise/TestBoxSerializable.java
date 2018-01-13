package com.techlabs.exercise;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestBoxSerializable {
	public static void main (String[] args) {
		Box myBox = new Box();
		myBox.setWidth(50);
		myBox.setHeight(20);
		myBox.print();
		try {
			FileOutputStream fileOutput = new FileOutputStream("foo.txt");
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			objectOutput.writeObject(myBox);
			objectOutput.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

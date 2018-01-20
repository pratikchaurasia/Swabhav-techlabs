package com.techlabs.assignment5;

import java.io.IOException;

public class TestPropertyFile {
	public static void main(String args[]) throws IOException{
		PropertyFile property=new PropertyFile();
		property.createProperty();
		property.readProperty();
	}

}

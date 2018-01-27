package com.techlabs.assignment5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public void createProperty() throws IOException {
		Properties property = new Properties();

		property.setProperty("database", "localhost");
		property.setProperty("password", "xyz@123");
		property.setProperty("user", "pratik");
		property.store(new FileWriter("config.properties"),
				"Properties Example");

		System.out.println("Property File created");
	}

	public void readProperty() throws IOException {
		FileReader reader = new FileReader("config.properties");

		Properties property = new Properties();
		property.load(reader);

		System.out.println("Database : " + property.getProperty("database"));
		System.out.println("Password : " + property.getProperty("password"));
		System.out.println("User : " + property.getProperty("user"));

	}
}

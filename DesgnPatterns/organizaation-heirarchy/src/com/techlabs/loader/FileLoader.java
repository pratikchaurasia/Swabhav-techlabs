package com.techlabs.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileLoader {
	private final String defaultPath = "C:/Users/win8/Downloads/NPL/spcc/english/CSS/";
	private Set<String> employeeSet;

	public FileLoader() {
		employeeSet = new HashSet<String>();
	}

	public Set<String> loadFile() throws IOException {
		BufferedReader bufferReader = new BufferedReader(new FileReader(
				defaultPath + "dataFile.txt"));

		String currentLine = "";
		while ((currentLine = bufferReader.readLine()) != null) {
			employeeSet.add(currentLine);
		}
		return employeeSet;

	}

}

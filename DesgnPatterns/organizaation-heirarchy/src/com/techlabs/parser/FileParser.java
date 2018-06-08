package com.techlabs.parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.techlabs.builder.EmployeeDTO;
import com.techlabs.employee.Employee;
import com.techlabs.loader.FileLoader;

public class FileParser {
	private BufferedReader reader;
	private Set<String> employeeSet = new HashSet<String>();
	private List<EmployeeDTO> employeeList = new ArrayList<EmployeeDTO>();
	private FileLoader loader;

	public FileParser(FileLoader loader) {
		this.loader = loader;
	}

	public List<EmployeeDTO> parse() throws FileNotFoundException, IOException {
		employeeSet = loader.loadFile();
		for (String employee : employeeSet) {
			String[] emp = employee.split(",");

			employeeList.add(new EmployeeDTO(emp[0], emp[1],
					emp[2], emp[3], emp[4],emp[5], emp[6], emp[7]));
		}
		return employeeList;
	}
}

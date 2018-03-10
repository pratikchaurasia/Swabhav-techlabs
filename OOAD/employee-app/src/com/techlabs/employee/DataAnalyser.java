package com.techlabs.employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.techlabs.parser.CsvParser;

public class DataAnalyser {
	private CsvParser csvParser;
	private ArrayList<Employee> empList;

	public DataAnalyser(CsvParser csvParser) {
		this.csvParser = csvParser;
	}

	public Employee getMaxSalary() throws FileNotFoundException, IOException {
		empList = csvParser.parser();
		int previous = 0;
		Employee maxSalariedEmployee = null;
		for (Employee emp : empList) {
			if (emp.getSalary() > previous) {
				previous = emp.getSalary();
				maxSalariedEmployee = emp;
			}
		}
		return maxSalariedEmployee;
	}

}

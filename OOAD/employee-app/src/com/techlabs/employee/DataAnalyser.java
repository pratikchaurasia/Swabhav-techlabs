package com.techlabs.employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

import com.techlabs.parser.CsvParser;

public class DataAnalyser {
	private CsvParser csvParser;
	private HashSet<Employee> empList;

	public DataAnalyser(CsvParser csvParser) throws FileNotFoundException,
			IOException {
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

	public Map<Integer, Long> totalEmployeesInDepartment() {
		Map<Integer, Long> noOfEmployeesInDept = empList.stream().collect(
				Collectors.groupingBy(Employee::getDeptId,
						Collectors.counting())); 
		return noOfEmployeesInDept;
	}

	public Map<String, Long> totalEmployeesByDesignation() {
		Map<String, Long> noOfEmployeesByDesignation = empList.stream().collect(
				Collectors.groupingBy(Employee::getRole,
						Collectors.counting()));
		return noOfEmployeesByDesignation;
	}

}

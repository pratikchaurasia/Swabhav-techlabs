package com.techlabs.comparable;

import java.util.*;

class AgeComparator implements Comparator<Employee> {
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.getAge() == emp2.getAge())
			return 0;
		else if (emp1.getAge() > emp2.getAge())
			return 1;
		else
			return -1;
	}
}
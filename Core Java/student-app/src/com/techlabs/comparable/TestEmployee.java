package com.techlabs.comparable;

import java.util.*;

public class TestEmployee {
	public static void main(String args[]) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Pratik", 23));
		list.add(new Employee(106, "Krishna", 27));
		list.add(new Employee(105, "Shubham", 21));

		System.out.println("Sorting by Age using Comparable");
		Collections.sort(list);
		for (Employee emp : list) {
			System.out.println(emp.getEmpId() + " " + emp.getName() + " "
					+ emp.getAge());
		}
		System.out.println("\nSorting by Age using Comparator");
		Collections.sort(list, new AgeComparator());
		for (Employee emp : list) {
			System.out.println(emp.getEmpId() + " " + emp.getName() + " "
					+ emp.getAge());
		}
		System.out.println("\nSorting by Name using Comparator");
		Collections.sort(list, new NameComparator());
		for (Employee emp : list) {
			System.out.println(emp.getEmpId() + " " + emp.getName() + " "
					+ emp.getAge());
		}
	}
}
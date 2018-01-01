package com.techlabs.exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestNoOfConstructorsAndMethods {
	public static void main(String args[]) {

		try {

			Class className = Class.forName("java.lang.Object");
			Method methods[] = className.getDeclaredMethods();
			Constructor constructors[] = className.getDeclaredConstructors();

			System.out.println("Total number of methods in a class : "
					+ methods.length);
			System.out.println("Total number of Constructors in a class : "
					+ constructors.length);

			System.out.println("Total Number of Getters : "
					+ noOfGettersAndSetters(className, methods, "get"));
			System.out.println("Total Number of Setters : "
					+ noOfGettersAndSetters(className, methods, "set"));

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}

	public static int noOfGettersAndSetters(Class classType, Method methods[], String prefix) {
		int noOfMethods = 0;
		for (Method method : methods) {
			String methodName = method.getName();
			if (methodName.startsWith(prefix)) {
				noOfMethods++;
			}
		}
		return noOfMethods;
	}

}

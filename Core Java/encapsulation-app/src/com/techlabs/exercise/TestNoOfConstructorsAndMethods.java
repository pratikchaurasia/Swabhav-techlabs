package com.techlabs.exercise;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;


public class TestNoOfConstructorsAndMethods {
	public static void main(String args[]) {

		try {

			Class className = Class.forName("com.techlabs.rectangle.Rectangle");
			Method methods[] = className.getDeclaredMethods();
			Constructor constructors[] = className.getDeclaredConstructors();
			Annotation[] annotations = className.isAnnotationPresent(NeedRefactory.Class);

			System.out.println("Total number of methods in a class : "
					+ methods.length);
			System.out.println("Total number of Constructors in a class : "
					+ constructors.length);

			System.out.println("Total Number of Getters : "
					+ noOfGettersAndSetters(className, methods, "get"));
			System.out.println("Total Number of Setters : "
					+ noOfGettersAndSetters(className, methods, "set"));
			System.out.println("Total Number of Annotations : "
					+ annotations.length);

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

package com.techlabs.assignment5;

public class TestDifferentWaysToCreateObject implements Cloneable {

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	String name = "Pratik";

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		TestDifferentWaysToCreateObject obj1 = new TestDifferentWaysToCreateObject();
		TestDifferentWaysToCreateObject obj2 = (TestDifferentWaysToCreateObject) obj1.clone();
		
		System.out.println(obj2.name);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		Class cls = Class.forName("com.techlabs.assignment5.TestDifferentWaysToCreateObject");
		TestDifferentWaysToCreateObject obj = (TestDifferentWaysToCreateObject) cls.newInstance();
        System.out.println(obj.name);
	}
}

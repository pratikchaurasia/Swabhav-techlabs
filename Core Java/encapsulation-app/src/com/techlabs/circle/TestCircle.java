package com.techlabs.circle;

public class TestCircle {
	public static void main(String args[]) {
		Circle[] circ = new Circle[3];
		Circle circle = new Circle(2.5f);
		printDetails(circle);

		Circle circle1 = new Circle(3.55f, BorderStyle.Dotted);
		printDetails(circle1);

		circ[0] = new Circle(2.3f);
		circ[1] = new Circle(3.9f,BorderStyle.Double);
		circ[2] = new Circle(5.5f);

		for (Circle cir : circ) {
			printDetails(cir);
		}

	}

	public static void printDetails(Circle c) {
		System.out.println("Radius is : " + c.getRadius());
		System.out.println("Area is : " + c.calcArea());
		System.out.println("Border Style :" + c.getBorderStyle());
		System.out.println(c.hashCode() + "\n");

	}

}

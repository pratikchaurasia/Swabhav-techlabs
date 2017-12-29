package com.techlabs.rectangle.test;

import java.io.ObjectInputStream.GetField;

import com.techlabs.rectangle.Rectangle;

public class TestRectangle {

	public static void main(String args[]) {
		Rectangle rectangle1;
		rectangle1 = new Rectangle();
		rectangle1.setWidth(100);
		rectangle1.setHeight(50);
		rectangle1.setBorderColor("pink");
		printDetails(rectangle1);

		Rectangle rectangle2;
		rectangle2 = new Rectangle();
		rectangle2.setWidth(10);
		rectangle2.setHeight(50);
		rectangle2.setBorderColor("Blue");
		printDetails(rectangle2);
		
		Rectangle rectangle3=rectangle1;
		rectangle3.setWidth(10);
		rectangle3.setHeight(10);
		rectangle3.setBorderColor("Green");
		rectangle3=null;
		printDetails(new Rectangle());
		

		printDetails(rectangle1);

	}

	public static void printDetails(Rectangle rectangle) {
		System.out.println("Width : " + rectangle.getWidth());
		System.out.println("Height : " + rectangle.getHeight());
		System.out.println("Area is : " + rectangle.calcArea());
		System.out.println("Border Color Is : " + rectangle.getBorderColor()
				);
		System.out.println(rectangle.hashCode()+ "\n");
	}

}

package com.techlabs.rectangle;

import com.techlabs.exercise.NeedRefactory;



public class Rectangle {
	private int width;
	private int height;
	private String borderColor;

	public int checkIfValid(int side) {
		if (side > 1 && side <= 100)
			return side;
		else if (side > 100)
			return 100;
		else
			return 1;
	}
	@NeedRefactory
	public void setWidth(int pwidth) {
		width = checkIfValid(pwidth);
	}
	@NeedRefactory
	public void setHeight(int pheight) {
		height = checkIfValid(pheight);
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public void setBorderColor(String bColor) {
		if (bColor.equalsIgnoreCase("red") || bColor.equalsIgnoreCase("blue")
				|| bColor.equalsIgnoreCase("green"))
			borderColor = bColor;
		else
			borderColor = "Red";
	}

	public String getBorderColor() {
		return borderColor;
	}

	public int calcArea() {
		int area = width * height;
		return area;
	}

}

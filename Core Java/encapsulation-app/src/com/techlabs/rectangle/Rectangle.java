package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	private String borderColor;

	public int checkIfValid(int param) {
		if (param > 1 && param <= 100)
			return param;
		else if (param > 100)
			return 100;
		else
			return 1;
	}

	public void setWidth(int pwidth) {
		width = checkIfValid(pwidth);
	}

	public void setHeight(int pheight) {
		height = checkIfValid(pheight);
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int calcArea() {
		int area = width * height;
		return area;
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

}

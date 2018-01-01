package com.techlabs.exercise;

import java.io.*;

public class Box implements Serializable {
	private int width;
	private int height;

	public void setWidth(int w) {
		width = w;
	}

	public void setHeight(int h) {
		height = h;
	}
	public void print() {
		System.out.println("Width :"+width);
		System.out.println("Height :"+height);
	}
}
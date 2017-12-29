package com.techlabs.circle;

public class Circle {
	private final float pi=3.141f;
	private float radius;
	private BorderStyle borderStyle;
	
	public Circle (float rad){
		this.radius=rad;
		this.borderStyle=borderStyle.Single;
	}
	
	public Circle (float rad,BorderStyle border) {
		this.radius=rad;
		this.borderStyle=border;		
	}
	
	public float getRadius() {
		return radius;	
	}
	
	public float calcArea(){
		return (2*pi*pi*radius);
	}
	public BorderStyle getBorderStyle(){
		return borderStyle;
	}
	
	
	

}

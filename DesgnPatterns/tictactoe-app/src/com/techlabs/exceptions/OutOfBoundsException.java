package com.techlabs.exceptions;

public class OutOfBoundsException extends RuntimeException {
	@Override 
	public String toString(){
		return "Enter a valid Index";
	}

}

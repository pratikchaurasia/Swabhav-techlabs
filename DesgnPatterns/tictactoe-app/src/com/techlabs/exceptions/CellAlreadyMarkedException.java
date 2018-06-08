package com.techlabs.exceptions;

public class CellAlreadyMarkedException extends RuntimeException {
 @Override
 public String toString(){
	 return "Cell Already Marked";
 }
}

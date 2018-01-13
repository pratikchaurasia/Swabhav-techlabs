package com.techlabs.account;

public class InvalidBalance extends RuntimeException{
	 public String toString(){
		 return "Insufficient Balance";
	 }

}

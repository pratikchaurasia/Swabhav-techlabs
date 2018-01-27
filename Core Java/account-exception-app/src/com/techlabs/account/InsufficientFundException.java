package com.techlabs.account;

public class InsufficientFundException extends RuntimeException{
	private Account acc;
	private double amount;
	 public InsufficientFundException(Account acc,double amount){
		 this.acc=acc;
		 this.amount=amount;
		 
	 }
	 @Override
	 public String getMessage(){
		 return ("Sorry the account balance in your Account No : "+acc.getAccNo()+" is less so the transaction can't be processed");
	 }
}

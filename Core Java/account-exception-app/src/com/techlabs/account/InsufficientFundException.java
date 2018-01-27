package com.techlabs.account;

public class InsufficientFundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3072718251518334353L;
	private Account acc;
	private double amount;

	public InsufficientFundException(Account acc, double amount) {
		this.acc = acc;
		this.amount = amount;

	}

	@Override
	public String getMessage() {
		return ("Sorry the account balance in your Account No : "
				+ acc.getAccNo() + " is "+acc.getBalance()+" and you are trying to withdraw "+amount+"  so the transaction can't be processed!");
	}
}

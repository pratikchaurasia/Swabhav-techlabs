package ocp.refactor;

import ocp.voilation.FestivalType;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principalAmount;
	private int numberOfYears;
	private IFestivalRate festival;

	public FixedDeposit(int accountNumber, String name, double principalAmount,
			int numberOfYears, IFestivalRate festival) {
		this.setAccountNumber(accountNumber);
		this.setName(name);
		this.principalAmount = principalAmount;
		this.numberOfYears = numberOfYears;
		this.festival = festival;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double calculateTotalInterest() {
		double rate = this.festival.getRate();
		return (principalAmount * numberOfYears * rate / 100);
	}

}
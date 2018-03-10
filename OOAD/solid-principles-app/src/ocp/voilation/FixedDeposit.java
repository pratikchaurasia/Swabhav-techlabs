package ocp.voilation;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principalAmount;
	private int numberOfYears;
	private FestivalType festival;
	
	public FixedDeposit(int accountNumber , String name, double principalAmount,int numberOfYears, FestivalType festival){
		this.setAccountNumber(accountNumber);
		this.setName(name);
		this.principalAmount=principalAmount;
		this.numberOfYears=numberOfYears;
		this.festival=festival;
	}
	
	public double calculateTotalInterest(){
		if(festival==FestivalType.NEW_YEAR){
			return (principalAmount*numberOfYears*8/100);
		}
		else if(festival==FestivalType.HOLI){
			return (principalAmount*numberOfYears*8.5/100);
		}
		else
			return (principalAmount*numberOfYears*7/100);
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

}

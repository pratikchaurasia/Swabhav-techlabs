package ocp.voilation.test;

import ocp.voilation.FestivalType;
import ocp.voilation.FixedDeposit;

public class TestFixedDeposit {
	public static void main(String argsp[]){
		FixedDeposit fixedDeposit=new FixedDeposit(100, "pratik", 150.0, 3, FestivalType.HOLI);
		System.out.println("Account number : " +fixedDeposit.getAccountNumber());
		System.out.println("Account holder name : "+fixedDeposit.getName());
		System.out.println("Intrest is : "+fixedDeposit.calculateTotalInterest());
	}
}

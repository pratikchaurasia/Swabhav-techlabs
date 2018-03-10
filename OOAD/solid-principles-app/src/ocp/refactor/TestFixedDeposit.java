package ocp.refactor;

public class TestFixedDeposit {
	public static void main(String args[]){
		FixedDeposit fixedDeposit = new FixedDeposit(100, "pratik", 150.0, 3, new Festival_NEW_YEAR());
		System.out.println("Name of Account Holder :"+fixedDeposit.getName());
		System.out.println("Interst is : "+fixedDeposit.calculateTotalInterest());
	}
}

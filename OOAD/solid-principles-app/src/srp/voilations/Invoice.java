package srp.voilations;

public class Invoice {
	private int number;
	private String name;
	private double cost;
	private final double GST=.005;
	private double percentDiscount;
	
	public Invoice(int number, String name, double cost, double percentDiscount){
		this.number=number;
		this.name=name;
		this.cost=cost;
		this.percentDiscount=percentDiscount;
	}
	
	private double calculteDiscount(){
		return (cost*percentDiscount/100);
	}
	
	private double calculateTax(){
		return (cost*GST);
	}
	
	public double totalCost(){
		return (cost-calculteDiscount()+calculateTax());
	}
	
	public void printInvoice(){
		System.out.println("Item number : "+number);
		System.out.println("Item name : "+name);
		System.out.println("Item cost : "+cost);
		System.out.println("The total cost of product is : "+totalCost());
	}
	
}

package srp.refactor;

public class Invoice {
	private int number;
	private String name;
	private double cost;
	private final double GST=.005;
	private double percentDiscount;
	
	public Invoice(int number, String name, double cost, double percentDiscount){
		this.setNumber(number);
		this.setName(name);
		this.setCost(cost);
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getCost() {
		return cost;
	}
}

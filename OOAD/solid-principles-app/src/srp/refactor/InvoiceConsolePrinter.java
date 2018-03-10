package srp.refactor;


public class InvoiceConsolePrinter {
	public void printInvoice (Invoice invoice){
		System.out.println("Name : "+invoice.getName());
		System.out.println("Name : "+invoice.getNumber());
		System.out.println("Name : "+invoice.getCost());
		System.out.println("The total cost of product is : "+invoice.totalCost());
	}
}

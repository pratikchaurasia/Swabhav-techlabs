package srp.refactor;



public class TestRefactorInvoice {
	public static void main(String args[]){
		Invoice invoice = new Invoice(100, "Pratik", 150.0, 20.0);
		InvoiceConsolePrinter printDetails=new InvoiceConsolePrinter();
		
		printDetails.printInvoice(invoice);
		
		
	}
}

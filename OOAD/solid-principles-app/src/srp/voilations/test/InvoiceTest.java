package srp.voilations.test;

import srp.voilations.Invoice;

public class InvoiceTest {
	public static void main(String args[]){
		Invoice invoiceObject=new Invoice(100, "Pratik", 150.0, 20.0);
		
		invoiceObject.printInvoice();
		
	}

}

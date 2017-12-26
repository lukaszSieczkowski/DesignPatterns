package designPatterns.structural.fasade;

public class InvoiceCustomerSystem {
	public void createInvoiceForBill(Bill bill) {
		System.out.println("Creating invoice for a biil with amount: " + bill.getAmount());
	}
}

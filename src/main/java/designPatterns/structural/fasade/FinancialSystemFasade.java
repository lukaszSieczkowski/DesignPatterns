package designPatterns.structural.fasade;

public class FinancialSystemFasade {

	private BillingSystem billingSystem;
	private InvoiceCustomerSystem invoiceCustomerSystem;

	public void createInvoice(Integer amount) {
		Bill bill = billingSystem.createBill(1000);
		invoiceCustomerSystem.createInvoiceForBill(bill);
	}

	public BillingSystem getBillingSystem() {
		return billingSystem;
	}

	public void setBillingSystem(BillingSystem billingSystem) {
		this.billingSystem = billingSystem;
	}

	public InvoiceCustomerSystem getInvoiceCustomerSystem() {
		return invoiceCustomerSystem;
	}

	public void setInvoiceCustomerSystem(InvoiceCustomerSystem invoiceCustomerSystem) {
		this.invoiceCustomerSystem = invoiceCustomerSystem;
	}

}

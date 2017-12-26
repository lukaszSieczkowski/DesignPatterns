package designPatterns.structural.fasade;

/**
 * A facade is an object that provides a simplified interface to a larger body
 * of code, such as a class library. A facade can
 * 
 * make a software library easier to use, understand, and test, since the facade
 * has convenient methods for common tasks,
 * 
 * make the library more readable, for the same reason,
 * 
 * reduce dependencies of outside code on the inner workings of a library, since
 * most code uses the facade, thus allowing more flexibility in developing the
 * system,
 * 
 * wrap a poorly designed collection of APIs with a single well-designed API.
 * 
 * The Facade design pattern is often used when a system is very complex or
 * difficult to understand because the system has a large number of
 * interdependent classes or its source code is unavailable.
 */
public class Client {

	public static void main(String[] args) {

		BillingSystem billingSystem = new BillingSystem();
		InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();
		FinancialSystemFasade fasade = new FinancialSystemFasade();
		fasade.setBillingSystem(billingSystem);
		fasade.setInvoiceCustomerSystem(invoiceCustomerSystem);
		fasade.createInvoice(100);
	}

}

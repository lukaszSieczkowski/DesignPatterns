package designPatterns.creational.factoryPattern;

/**
 * Factory method pattern is a creational pattern that uses factory methods to
 * deal with the problem of creating objects without having to specify the exact
 * class of the object that will be created.
 *
 */

public class Client {

	public static void main(String[] args) {
		TransportFactory factory = new BikeFactory();
		Transport transport = factory.create();

		System.out.println(transport.drive());

		factory = new CarFactory();
		transport = factory.create();

		System.out.println(transport.drive());

	}
}

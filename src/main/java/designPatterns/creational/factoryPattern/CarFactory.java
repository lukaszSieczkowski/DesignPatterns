package designPatterns.creational.factoryPattern;

public class CarFactory extends TransportFactory {

	@Override
	Transport create() {
		return new Car();
	}

}

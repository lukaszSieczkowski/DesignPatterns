package designPatterns.creational.factoryPattern;

public class BikeFactory extends TransportFactory {

	@Override
	Transport create() {
		return new Bike();
	}

}

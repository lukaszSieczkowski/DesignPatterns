package designPatterns.creational.factory;

public class BikeFactory extends TransportFactory {

	@Override
	Transport create() {
		return new Bike();
	}

}

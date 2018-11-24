package designPatterns.structural.adapter;

/**
 * Adapter is a pattern that allows the interface of an existing class to
 * be used as another interface.[1] It is often used to make existing classes
 * work with others without modifying their source code.
 */
public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		LegacyRectangle legacyRectangle = new LegacyRectangle();
		LegacyRectangleAddapter addapter = new LegacyRectangleAddapter(legacyRectangle);
		client.calculateRectangleSize(addapter);

	}

	public void calculateRectangleSize(Rectangle rectangle) {
		System.out.println("Rectangle size: " + rectangle.determineSize());
	}
}

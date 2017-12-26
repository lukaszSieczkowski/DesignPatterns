package designPatterns.structural.adapter;

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

package designPatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * The proxy pattern is a design pattern that creates a surrogate, or
 * placeholder class. Proxy instances accept requests from client objects, pass
 * them to the underlying object and return the results. Proxies can improve
 * efficiency and enhance functionality.
 * 
 */

public class Client {

	public static void main(String[] args) {
		ImageProxy image1 = new ImageProxy("Test image");
		ImageProxy image2 = new ImageProxy("Second image");

		List<Image> images = new ArrayList<Image>();
		images.add(image1);
		images.add(image2);

		Application application = new Application(images);
		System.out.println("Application set up");
		application.draw();
	}

}

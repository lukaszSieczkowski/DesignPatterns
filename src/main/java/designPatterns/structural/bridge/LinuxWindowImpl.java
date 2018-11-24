package designPatterns.structural.bridge;

public class LinuxWindowImpl extends WindowImpl {

	@Override
	void draw(int x, int y, int width, int height, String colour) {
		System.out.println("Draw in Linux x:" + x + " y: " + y + " width " + width + " height " + height);

	}

}

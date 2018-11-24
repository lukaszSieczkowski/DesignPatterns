package designPatterns.structural.bridge;

public class DirectXWindowImpl extends WindowImpl {

	@Override
	void draw(int x, int y, int width, int height, String colour) {
		System.out.println("Draw in Windows x:" + x + " y: " + y + " width " + width + " height " + height);
	}

}

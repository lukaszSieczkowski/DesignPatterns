package designPatterns.structural.decorator;

public class IconWindowDecorator extends WindowDecorator {

	public IconWindowDecorator(Window window) {
		super(window);
	}
	
	public void draw() {
		System.out.println("Drawing icon");
		window.draw();
	}

}

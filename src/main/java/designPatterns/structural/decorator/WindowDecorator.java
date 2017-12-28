package designPatterns.structural.decorator;

public class WindowDecorator extends Window {
	protected Window window;

	public WindowDecorator(Window window) {
		this.window = window;
	}

	public void draw() {
		window.draw();
	}
}

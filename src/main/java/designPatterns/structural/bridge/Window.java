package designPatterns.structural.bridge;

public class Window {

	private WindowImpl window;

	public void draw(int x, int y, int height, int width, String color) {
		window.draw(x, y, width, height, color);
	}

	public WindowImpl getWindow() {
		return window;
	}

	public void setWindow(WindowImpl window) {
		this.window = window;
	}

}

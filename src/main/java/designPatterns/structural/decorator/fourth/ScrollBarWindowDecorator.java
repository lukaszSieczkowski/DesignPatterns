package designPatterns.structural.decorator.fourth;

public class ScrollBarWindowDecorator extends WindowDecorator {

	public ScrollBarWindowDecorator(Window window) {
		super(window);
	}

	public void draw() {
		System.out.println("Drawing scrollbar");
		window.draw();
	}

}

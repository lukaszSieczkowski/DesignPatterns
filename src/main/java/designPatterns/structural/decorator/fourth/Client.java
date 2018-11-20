package designPatterns.structural.decorator.fourth;

/**
 * The decorator pattern is a design pattern that allows behavior to be added to
 * an individual object, either statically or dynamically, without affecting the
 * behavior of other objects from the same class.
 */

public class Client {

	public static void main(String[] args) {
		Window window = new Window();
		IconWindowDecorator iconWindowDecorator = new IconWindowDecorator(window);
		ScrollBarWindowDecorator scrollBarWindowDecorator = new ScrollBarWindowDecorator(iconWindowDecorator);
		
		scrollBarWindowDecorator.draw();

	}

}

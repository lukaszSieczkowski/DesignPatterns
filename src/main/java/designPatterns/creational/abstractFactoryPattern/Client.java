package designPatterns.creational.abstractFactoryPattern;

/**
* Abstract factory method pattern is a creational pattern that uses factory methods to
 * deal with the problem of creating group of objects without having to specify the exact
 * class of the object that will be created.
 */

public class Client {

	public static void initializeGUI(ScrollBar bar, Window window) {
		System.out.println("Initalize logic: " + bar.getClass().getName() + " " + window.getClass().getName());
	}
	
	public static void initializeGUI(ElementFactory factory) {
		initializeGUI(factory.createScrollBar(), factory.createWindow());
	}

	public static void main(String[] args) {
		//No Abstract Factory approach
		ScrollBar bar = new YellowThemeScrollBar();
		Window window = new YellowThemeWindow();
		initializeGUI(bar, window);
		
		//Abstract Factory approach
		ElementFactory yellowFactory = new YellowElementFactory();
		initializeGUI(yellowFactory);
		
		ElementFactory pinkFactory = new PinkElementFactory();
		initializeGUI(pinkFactory);

	}

}

package designPatterns.creational.abstractfactory;

public class PinkElementFactory implements ElementFactory {

	public ScrollBar createScrollBar() {
		return new PinkThemeScrollBar();
	}

	public Window createWindow() {
		return new PinkThemeWindow();
	}

}

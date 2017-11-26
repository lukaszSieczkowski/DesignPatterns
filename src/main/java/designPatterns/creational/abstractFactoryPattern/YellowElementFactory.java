package designPatterns.creational.abstractFactoryPattern;

public class YellowElementFactory implements ElementFactory{

	public ScrollBar createScrollBar() {
		return new YellowThemeScrollBar();
	}

	public Window createWindow() {
		return new YellowThemeWindow();
	}

}

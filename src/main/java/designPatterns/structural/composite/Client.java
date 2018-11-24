package designPatterns.structural.composite;

/**
 * e composite pattern describes a group of objects that is treated the same way
 * as a single instance of the same type of object. The intent of a composite is
 * to "compose" objects into tree structures to represent part-whole
 * hierarchies. Implementing the composite pattern lets clients treat individual
 * objects and compositions uniformly.
 */

public class Client {

	public static void main(String[] args) {
		Line line1 = new Line();
		Rectangle rectangle = new Rectangle();
		GraphicItemGroup group1 = new GraphicItemGroup();

		group1.getGraphics().add(line1);
		group1.getGraphics().add(rectangle);

		group1.draw();

		Line line2 = new Line();
		GraphicItemGroup group2 = new GraphicItemGroup();
		group2.getGraphics().add(line2);
		group2.getGraphics().add(group1);

		System.out.println();
		System.out.println("Drawing group 2");
		System.out.println();
		group2.draw();

	}

}

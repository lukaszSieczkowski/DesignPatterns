package designPatterns.structural.composite;

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

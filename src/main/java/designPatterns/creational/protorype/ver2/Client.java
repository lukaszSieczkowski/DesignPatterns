package designPatterns.creational.protorype.ver2;

/**
 * Prototype pattern refers to creating duplicate object while keeping
 * performance in mind. This type of design pattern comes under creational
 * pattern as this pattern provides one of the best ways to create an object.
 * 
 * This pattern involves implementing a prototype interface which tells to
 * create a clone of the current object. This pattern is used when creation of
 * object directly is costly. For example, an object is to be created after a
 * costly database operation. We can cache the object, returns its clone on next
 * request and update the database as and when needed thus reducing database
 * calls.
 * 
 * Where to use & benefits
 * 
 * When there are many subclasses that differ only in the kind of objects,
 * A system needs independent of how its objects are created, composed, and represented. 
 * Dynamic binding or loading a method. 
 * Use one instance to finish job just by changing its state or parameters.
 * Add and remove objects at runtime. 
 * Specify new objects by changing its structure.
 * Configure an application with classes dynamically.
 */

public class Client {

	public static void main(String[] args) {

		Image image = new Image();
		image.setUrl("http://test.com");

		GraphicTool graphicTool = new GraphicTool(image);
		Graphic createGraphic = graphicTool.createGraphic();
		System.out.println(createGraphic.getClass());
		System.out.println(createGraphic.getUrl());

		Video video = new Video();
		video.setUrl("http://test.com");
		graphicTool.setPrototype(video);
		createGraphic = graphicTool.createGraphic();
		System.out.println(createGraphic.getClass());
		System.out.println(createGraphic.getUrl());
	}

}

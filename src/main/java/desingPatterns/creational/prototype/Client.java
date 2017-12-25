package desingPatterns.creational.prototype;

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

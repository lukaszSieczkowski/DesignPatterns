package designPatterns.structural.proxy;

public class ImageProxy extends Image {
	private Image image;

	public ImageProxy(String url) {
		super();
		this.url = url;
	}

	public void draw() {
		if (image == null) {
			image = new Image(this.url);
		}
		image.draw();
	}

}

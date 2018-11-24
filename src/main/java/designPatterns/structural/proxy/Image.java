package designPatterns.structural.proxy;

public class Image {
	protected String url;

	public Image() {
		super();
	}

	public Image(String url) {
		System.out.println("Loading image");
		this.url = url;
	}

	public void draw() {
		System.out.println("Draw imga with Url: " + url);
	}

}

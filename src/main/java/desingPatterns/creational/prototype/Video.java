package desingPatterns.creational.prototype;

public class Video extends Graphic {
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}

	public Graphic clone() {
		Video clone = new Video();
		clone.setUrl(url);
		return clone;
	}

	public String getUrl() {
		return url;
	}
}

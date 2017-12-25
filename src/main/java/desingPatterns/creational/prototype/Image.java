package desingPatterns.creational.prototype;

public class Image extends Graphic {
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}

	public Graphic clone() {
		Image clone = new Image();
		clone.setUrl(url);
		return clone;
	}

	public String getUrl() {
		return url;
	}
}

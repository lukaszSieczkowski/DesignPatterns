package designPatterns.structural.adapter;

public class LegacyRectangleAddapter extends Rectangle {
	private LegacyRectangle legacyRectangle;

	public LegacyRectangleAddapter(LegacyRectangle legacyRectangle) {
		this.legacyRectangle = legacyRectangle;
	}

	public Integer determineSize() {
		return legacyRectangle.calculateSize();
	}
}

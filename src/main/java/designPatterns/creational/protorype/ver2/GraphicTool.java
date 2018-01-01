package designPatterns.creational.protorype.ver2;

public class GraphicTool {
	private Graphic prototype;

	public GraphicTool(Graphic prototype) {
		this.prototype = prototype;
	}

	protected Graphic createGraphic() {
		return (Graphic) prototype.clone();
	}

	public void setPrototype(Graphic prototype) {
		this.prototype = prototype;
	}

}

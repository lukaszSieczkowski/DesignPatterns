package designPatterns.creational.protorype.ver1;

public class GraphicTool {
	private Graphic prototype;

	public GraphicTool(Graphic prototype) {
		this.prototype = prototype;
	}

	protected Graphic createGraphic() {
		return prototype.clone();
	}

	public void setPrototype(Graphic prototype) {
		this.prototype = prototype;
	}

}

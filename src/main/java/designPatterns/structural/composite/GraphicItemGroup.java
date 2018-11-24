package designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GraphicItemGroup implements Graphic {
	
	private List<Graphic> graphics = new ArrayList<Graphic>();

	public void draw() {
		for(Graphic graphic: graphics) {
			graphic.draw();
		}
	}

	public List<Graphic> getGraphics() {
		return graphics;
	}

}

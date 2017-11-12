package designPatterns.creational.builder.classic;

public class Set2 extends Builder {

	@Override
	public void buildMonitor() {
		computerSet.setMonitor("LG");
	}

	@Override
	public void buildCPU() {
		computerSet.setCpu("AMD");
	}

	@Override
	public void buildGrphicCard() {
		computerSet.setGraphicCard("Nvidia");
	}

	@Override
	public void buildRAM() {
		computerSet.setRam("DDR3");
	}

	@Override
	public void buildHDD() {
		computerSet.setHdd("Segate");
	}
}

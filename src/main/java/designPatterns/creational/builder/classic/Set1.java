package designPatterns.creational.builder.classic;

public class Set1 extends Builder {

	@Override
	public void buildMonitor() {
		computerSet.setMonitor("Benq 19");
	}

	@Override
	public void buildCPU() {
		computerSet.setCpu("Intel");
	}

	@Override
	public void buildGrphicCard() {
		computerSet.setGraphicCard("ATI");
	}

	@Override
	public void buildRAM() {
		computerSet.setRam("DDR2");
	}

	@Override
	public void buildHDD() {
		computerSet.setHdd("Samsung");
	}

	@Override
	public String toString() {
		return "Set1 [computerSet=" + computerSet + "]";
	}
	
	
}

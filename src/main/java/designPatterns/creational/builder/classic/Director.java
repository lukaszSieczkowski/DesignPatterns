package designPatterns.creational.builder.classic;

public class Director {
	private Builder builder;

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public ComputerSet getSet() {
		return builder.getComputerSet();
	}

	public void constructComputerSet() {
		builder.newSet();
		builder.buildMonitor();
		builder.buildCPU();
		builder.buildGrphicCard();
		builder.buildHDD();
		builder.buildRAM();
	}

}

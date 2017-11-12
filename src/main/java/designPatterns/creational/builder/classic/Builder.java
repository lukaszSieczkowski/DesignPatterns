package designPatterns.creational.builder.classic;

abstract class Builder {
	protected ComputerSet computerSet;
	
	public void newSet() {
		computerSet = new ComputerSet();
	}
	
	public ComputerSet getComputerSet() {
		return computerSet;
	}
	
	public abstract void buildMonitor();
	public abstract void buildCPU();
	public abstract void buildGrphicCard();
	public abstract void buildRAM();
	public abstract void buildHDD();
}

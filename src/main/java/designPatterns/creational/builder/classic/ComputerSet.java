package designPatterns.creational.builder.classic;

public class ComputerSet {
	private String monitor;
	private String cpu;
	private String graphicCard;
	private String ram;
	private String hdd;

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGraphicCard() {
		return graphicCard;
	}

	public void setGraphicCard(String graphicCard) {
		this.graphicCard = graphicCard;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public void show() {
		if (monitor != null) {
			System.out.println("Monitor: " + monitor);
		}
		if (cpu != null) {
			System.out.println("CPU: " + cpu);
		}
		if (graphicCard != null) {
			System.out.println("Graphic Card: " + graphicCard);
		}
		if (ram != null) {
			System.out.println("RAM: " + ram);
		}
		if (hdd != null) {
			System.out.println("HDD: " + hdd);
		}
	}

}

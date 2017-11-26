package designPatterns.creational.builder.internal;

public class ComputerSet {
	private String monitor;
	private String cpu;
	private String graphicCard;
	private String ram;
	private String hdd;

	private ComputerSet(Builder builder) {
		this.monitor = builder.monitor;
		this.cpu = builder.cpu;
		this.graphicCard = builder.graphicCard;
		this.ram = builder.ram;
		this.hdd = builder.hdd;
	}

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

	public static class Builder {
		private String monitor;
		private String cpu;
		private String graphicCard;
		private String ram;
		private String hdd;

		public Builder monitor(String monitor) {
			this.monitor = monitor;
			return this;
		}

		public Builder cpu(String cpu) {
			this.cpu = cpu;
			return this;
		}

		public Builder graphicCard(String grahicCard) {
			this.graphicCard = grahicCard;
			return this;
		}

		public Builder ram(String ram) {
			this.ram = ram;
			return this;
		}

		public Builder hdd(String hdd) {
			this.hdd = hdd;
			return this;
		}

		public ComputerSet build() {
			return new ComputerSet(this);
		}

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

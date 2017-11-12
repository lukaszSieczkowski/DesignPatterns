package designPatterns.creational.builder.internal;

public class Main {

	public static void main(String[] args) {
		ComputerSet computerSet = new ComputerSet.Builder().cpu("Intel").graphicCard("Nvidia").monitor("LG")
				.hdd("Samsung").ram("DDR2").build();
		computerSet.show();
	}

}

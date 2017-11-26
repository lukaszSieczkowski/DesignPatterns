package designPatterns.creational.builder.classic;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		Builder builder1 = new Set1();
		Builder builder2 = new Set2();

		System.out.println("Set No. 1");
		director.setBuilder(builder1);
		director.constructComputerSet();
		ComputerSet computerSet1 = director.getSet();
		computerSet1.show();

		System.out.println("Set No. 1");
		director.setBuilder(builder2);
		director.constructComputerSet();
		ComputerSet computerSet2 = director.getSet();
		computerSet2.show();
	}

}

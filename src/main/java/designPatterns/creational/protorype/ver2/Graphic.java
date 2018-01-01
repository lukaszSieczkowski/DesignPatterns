package designPatterns.creational.protorype.ver2;

public abstract class Graphic implements Cloneable {

	public abstract String getUrl();
	
	public Object clone() {
		Object obj =null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}

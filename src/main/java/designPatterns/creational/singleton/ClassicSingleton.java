package designPatterns.creational.singleton;

/**
 * Singleton pattern creates only one instance of object and create global
 * access to it
 */

public class ClassicSingleton {
	private static ClassicSingleton instance = null;

	private ClassicSingleton() {

	}

	public static ClassicSingleton getInstance() {
		if (instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}
}

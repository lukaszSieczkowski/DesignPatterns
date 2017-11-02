package designPatterns.creational.singleton;

/**
 * Singleton pattern creates only one instance of object and create global
 * access to it Thread safe implementation.Instance is declared as volatile
 * variable to ensure every thread see updated value for instance.
 */
public class VolatileSingleton {

	private static volatile VolatileSingleton instance = null;

	private VolatileSingleton() {

	}

	public static VolatileSingleton getInstance() {
		if (instance == null) {
			synchronized (VolatileSingleton.class) {
				if (instance == null) {
					instance = new VolatileSingleton();
				}
			}
		}
		return instance;
	}
}

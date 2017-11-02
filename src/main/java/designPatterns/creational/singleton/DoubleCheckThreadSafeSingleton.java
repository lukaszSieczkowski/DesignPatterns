package designPatterns.creational.singleton;

/**
 * Singleton pattern creates only one instance of object and create global
 * access to it Thread safe implementation.This implementation minimize cost of
 * synchronization and improve performance, by only locking critical section of
 * code,
 */

public class DoubleCheckThreadSafeSingleton {
	private static DoubleCheckThreadSafeSingleton instance = null;

	private DoubleCheckThreadSafeSingleton() {

	}

	public static DoubleCheckThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}

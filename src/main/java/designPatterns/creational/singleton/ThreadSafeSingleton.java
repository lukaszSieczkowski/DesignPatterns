package designPatterns.creational.singleton;

/**
 * Singleton pattern creates only one instance of object and create global
 * access to it Thread safe implementation. Low performance due synchronization
 * whole method at every call
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance = null;

	private ThreadSafeSingleton() {

	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}

package designPatterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ThreadSafeSingletonTest {
	private ThreadSafeSingleton firstSingleton;
	private ThreadSafeSingleton secondSingleton;

	@Before
	public void init2() {
		firstSingleton = ThreadSafeSingleton.getInstance();
		secondSingleton = ThreadSafeSingleton.getInstance();
	}

	@Test
	public void check_is_only_one_singleton_instance() {
		assertEquals(true, firstSingleton == secondSingleton);
	}
}

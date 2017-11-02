package designPatterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DoubleCheckThreadSafeSingletonTest {
	private DoubleCheckThreadSafeSingleton firstSingleton;
	private DoubleCheckThreadSafeSingleton secondSingleton;

	@Before
	public void init2() {
		firstSingleton = DoubleCheckThreadSafeSingleton.getInstance();
		secondSingleton = DoubleCheckThreadSafeSingleton.getInstance();
	}

	@Test
	public void check_is_only_one_singleton_instance() {
		assertEquals(true, firstSingleton == secondSingleton);
	}
}

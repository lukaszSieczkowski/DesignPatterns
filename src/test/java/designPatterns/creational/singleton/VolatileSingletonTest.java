package designPatterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VolatileSingletonTest {
	private VolatileSingleton firstSingleton;
	private VolatileSingleton secondSingleton;

	@Before
	public void init2() {
		firstSingleton = VolatileSingleton.getInstance();
		secondSingleton = VolatileSingleton.getInstance();
	}

	@Test
	public void check_is_only_one_singleton_instance() {
		assertEquals(true, firstSingleton == secondSingleton);
	}
}

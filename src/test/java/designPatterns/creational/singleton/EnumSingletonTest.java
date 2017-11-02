package designPatterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EnumSingletonTest {

	EnumSingleton firstSingleton = null;
	EnumSingleton secondSingleton = null;

	@Before
	public void init() {
		firstSingleton = EnumSingleton.INSTANCE;
		secondSingleton = EnumSingleton.INSTANCE;
	}

	@Test
	public void check_is_only_one_singleton_instance() {
		assertEquals(true, firstSingleton == secondSingleton);
	}
}

package designPatterns.creational.singleton;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;


public class ClasicSingletonTest {

	private ClassicSingleton singleton_first;
	private ClassicSingleton singleton_second;

	@Before
	public void init() {
		singleton_first = ClassicSingleton.getInstance();
		singleton_second = ClassicSingleton.getInstance();
	}

	@Test
	public void check_is_only_one_singleton_instance() {
		assertEquals(true, singleton_first.equals(singleton_second));
	}

}

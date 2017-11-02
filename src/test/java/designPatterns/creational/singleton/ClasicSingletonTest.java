package designPatterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClasicSingletonTest {

	private ClassicSingleton firstSingleton;
	private ClassicSingleton secondSingleton;

	@Before
	public void init2() {
		firstSingleton = ClassicSingleton.getInstance();
		secondSingleton = ClassicSingleton.getInstance();
	}

	@Test
	public void check_is_only_one_singleton_instance() {
		assertEquals(true, firstSingleton == secondSingleton);
	}
}

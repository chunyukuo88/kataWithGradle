package kataWithGradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RubbishTest {
	Rubbish underTest = new Rubbish();

	@Test
	public void testGetName() {
		String expected = underTest.getName();
		assertEquals(expected, "Chuck Norris");
	}
	
}

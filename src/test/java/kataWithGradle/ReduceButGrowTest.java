package kataWithGradle;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReduceButGrowTest {
	ReduceButGrow underTest = new ReduceButGrow();

	@Test
	public void testArrayGetter() {
		int[] expected = underTest.getArray();
//		assertEquals(expected, int[]{1,2,3});   NOPE
//		assertThat(expected, is(int[]{1,2,3})); NOPE
		assertEquals(expected.length, 3);
	}
}

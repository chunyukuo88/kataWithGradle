package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsogramsTest {

	@Test
	public void canReturnWordAsSortedArray() throws Exception {
		Isograms underTest = new Isograms();
		String[] output = underTest.produceSortedArray("abcda");
		String[] expectedResult = {"a", "a", "b", "c", "d"};
		assertArrayEquals(output, expectedResult);
	}
	
	@Test
	public void canTellIfIsogram() throws Exception {
		Isograms underTest = new Isograms();
		boolean isIsogram = underTest.isIsogram("abcA");
		assertEquals(isIsogram, false);
	}
}

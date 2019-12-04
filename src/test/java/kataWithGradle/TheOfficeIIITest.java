package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheOfficeIIITest {

	@Test
	public void canSwitchOnesAndZeroes() throws Exception {
		TheOfficeIII underTest = new TheOfficeIII();
		String inputString = "00001111";
		String switched = "11110000";
		String result = underTest.broken(inputString);
		assertEquals(result, switched); 
	}
}

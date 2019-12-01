package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheOfficeIVTest {

	@Test
	public void findFirstO() throws Exception {
		TheOfficeIV underTest = new TheOfficeIV();
		char[] testArray = {'X', 'X', 'O', 'X', 'O'};
		int expectedOutput = underTest.meeting(testArray);
		assertEquals(2, expectedOutput);
	}
	

}

package kataWithGradle;

// For the kata @ https://www.codewars.com/kata/backspaces-in-string/train/java

import static org.junit.Assert.*;

import org.junit.Test;

public class BackspacesInStringTest {

	@Test
	public void canReturnBlanks() throws Exception {
		BackspacesInString underTest = new BackspacesInString();
		String input = "";
		String output = underTest.processBlankString(input);
		String expectedResult = "";
		assertEquals(output, expectedResult);
	}
	
	@Test
	public void canHandleAllPounds() throws Exception {
		BackspacesInString underTest = new BackspacesInString();
		assertEquals(underTest.poundString("#######"), "");
	}
	
	@Test
	public void canHandleAnyString() throws Exception {
		BackspacesInString underTest = new BackspacesInString();
		assertEquals(underTest.cleanString("abc#d##c"), "ac");
	}
}

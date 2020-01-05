package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquashBugsTest {

	@Test
	public void canFindTheLengthOfLongestWord() throws Exception {
		SquashBugs underTest = new SquashBugs();
		String input = "What is the longest word in this sentence";
		int output = underTest.findLongest(input);
		int expectedResult = 8;
		assertEquals(output, expectedResult);
		
	}
}

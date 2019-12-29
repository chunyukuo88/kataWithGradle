package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTest {

	@Test
	public void canPigSingleWord() throws Exception {
		PigLatin underTest = new PigLatin();
		String input = "Pig";
		String output = underTest.pigSingleWord(input);
		String expectedResult = "igPay";
		assertEquals(output, expectedResult);
	}
	
	@Test
	public void canPigEntireSentence() throws Exception {
		PigLatin underTest = new PigLatin();
		String input = "Pig Roast Bonanza";
		String output = underTest.pigIt(input);
		String expectedResult = "igPay oastRay onanzaBay";
		assertEquals(output, expectedResult);
	}
	
	@Test
	public void canPigEntireSentenceWithPunctuation() throws Exception {
		PigLatin underTest = new PigLatin();
		String input = "Pig Roast Bonanza !";
		String output = underTest.pigIt(input);
		String expectedResult = "igPay oastRay onanzaBay !";
		assertEquals(output, expectedResult);
	}
}

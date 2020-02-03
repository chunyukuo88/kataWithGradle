package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class NarcNumTest {

	@Test
	public void canProduceIntegerLength() throws Exception {
		NarcNum underTest = new NarcNum();
		int input = 123;
		int expectedResult = underTest.findIntegerLength(input);
		assertEquals(expectedResult, 3);
	}
	
	@Test
	public void canApplyExponentToEachDigit() throws Exception {
		NarcNum underTest = new NarcNum();
		int input = 123;
		int expectedResult = underTest.exponentsForEachDigit(input);
		assertEquals(expectedResult, 36);
	}
	
	@Test
	public void canCheckIfNarcissistic() throws Exception {
		NarcNum underTest = new NarcNum();
		int input = 153;
		boolean expectedResult = underTest.isNarcNum(input);
		assertEquals(expectedResult, true);
		
		int input2 = 123;
		boolean expectedResult2 = underTest.isNarcNum(input2);
		assertEquals(expectedResult2, false);		
	}
}

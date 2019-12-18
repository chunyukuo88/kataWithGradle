package kataWithGradle;
//From this kata: https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java

import static org.junit.Assert.*;

import org.junit.Test;

public class TrailingZeroesTest {

//	@Test
	public void canProduceFactorial() throws Exception {
		TrailingZeroes underTest = new TrailingZeroes();
		int result = underTest.produceFactorial(4);
		assertEquals(result, 24);
	}
	
//	@Test
	public void determineIfLeadingZeroesArePresent() throws Exception {
		TrailingZeroes underTest = new TrailingZeroes();
		boolean result1 = underTest.detectTrailingZero(6);
		assertEquals(result1, true);
		
		boolean result2 = underTest.detectTrailingZero(3);
		assertEquals(result2, false);
	}
	
	@Test
	public void countZeroes() {
		TrailingZeroes underTest = new TrailingZeroes();
		int result = underTest.countZeroes(6);
		assertEquals(result, 1);
	}
}

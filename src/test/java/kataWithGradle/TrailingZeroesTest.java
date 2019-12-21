package kataWithGradle;
//From this kata: https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java

import static org.junit.Assert.*;

import org.junit.Test;

public class TrailingZeroesTest {

	@Test
	public void canProduceFactorial() throws Exception {
		TrailingZeroes underTest = new TrailingZeroes();
		int result = underTest.produceFactorial(7);
		assertEquals(result, 5040);
		
		int result2 = underTest.produceFactorial(8);
		assertEquals(result2, 40320);
	}
	
//	@Test
//	public void determineIfLeadingZeroesArePresent() {
//		TrailingZeroes underTest = new TrailingZeroes();
//		boolean result1 = underTest.detectTrailingZero(6);
//		assertEquals(result1, true);
//		
//		boolean result2 = underTest.detectTrailingZero(3);
//		assertEquals(result2, false);
//	}
//	
//	@Test
//	public void countZeroes() {
//		TrailingZeroes underTest = new TrailingZeroes();
//		int result = underTest.countZeroes(6);
//		assertEquals(result, 1);
//		
//		int result2 = underTest.countZeroes(10);
//		assertEquals(result2, 2);
//	}
//	
//	@Test
//	public void canCountTrailingZeroesUnoptimized() {
//		TrailingZeroes underTest = new TrailingZeroes();
//		int result = underTest.zeros(6);
//		assertEquals(result, 1);
//		
//		int result2 = underTest.zeros(14);
//		assertEquals(result2, 2);
//		
//		int result3 = underTest.zeros(0);
//		assertEquals(result3, 0);
//	}
}

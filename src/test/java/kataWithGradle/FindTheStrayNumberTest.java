package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindTheStrayNumberTest {
	
	@Test
	public void canProduceStraynumber() {
		FindTheStrayNumber underTest = new FindTheStrayNumber();
		int[] input1 = {1, 1, 9};
		int result1 = underTest.stray(input1);
		assertEquals(9, result1);
		
		int[] input2 = {0, 0, 9, 0, 0, 0, 0};
		int result2 = underTest.stray(input2);
		assertEquals(9, result2);
	}
}

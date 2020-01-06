package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class EqualSidesTest {

//	@Test
	public void testName() throws Exception {
		EqualSides underTest = new EqualSides();
		int[] input = {1, 1, 0, 2, 2};
		int output = underTest.indexSums(input, 2);
		int expectedResult = 6;
		assertEquals(output, expectedResult);
	}
	
//	@Test
	public void canTellIfSidesSumEqually() throws Exception {
		EqualSides underTest = new EqualSides();
		int[] input1 = {1, 1, 0, 2, 2};
		boolean output1 = false;
		boolean expectedResult1 = underTest.sidesAreEqual(input1);
		assertEquals(output1, expectedResult1);
		
		int[] input2 = {2, 2, 0, 1, 3};
		boolean output2 = true;
		boolean expectedResult2 = underTest.sidesAreEqual(input2);
		assertEquals(output2, expectedResult2);
	}
	
	@Test
	public void completesTheKata() throws Exception {
		EqualSides underTest = new EqualSides();
		int[] input1 = {2, 2, 1, 1, 3};
		int output1 = underTest.findEvenIndex(input1);
		assertEquals(output1, 2);
		
		int[] input2 = {2, 100, 0, 9, 3};
		int output2 = underTest.findEvenIndex(input2);
		assertEquals(output2, -1);
	}
	
}

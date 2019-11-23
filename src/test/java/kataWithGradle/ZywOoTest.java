package kataWithGradle;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZywOoTest {
	
	@Test
	public void canSortArrayInAscendingOrder() {
		ZywOo undertest = new ZywOo();
		int[] testArray = new int[] {1, 3, 1, 9};
		int[] sortedArray = new int[] {1, 1, 3, 9};
		int[] resultArray = undertest.sortAscending(testArray);
		assertArrayEquals(resultArray, sortedArray);
	}
	
	@Test
	public void canSortArrayInDescendingOrder() {
		ZywOo undertest = new ZywOo();
		int[] testArray = new int[] {1, 3, 1, 9};
		int[] sortedArray = new int[] {9, 3, 1, 1}; 
		int[] resultArray = undertest.sortDescending(testArray);
		assertArrayEquals(resultArray, sortedArray);
	}
	
	@Test
	public void shouldReturnZeroIfOnlyOneElement() {
		ZywOo undertest = new ZywOo();
		int[] testArray = new int[] {19};
		int result = undertest.returnZero(testArray);
		assertEquals(result, 0);
	}
	
	@Test
	public void canProduceArrayOfDifferences() {
		ZywOo undertest = new ZywOo();
		int[] testArray = new int[] {3, 1, 9};
		int[] differenceArray = new int[] {6, 2};
		int[] resultArray = undertest.produceDifferences(testArray);
		assertArrayEquals(differenceArray, resultArray);
	}
	
	@Test
	public void canSumUpDifferences() {
		ZywOo undertest = new ZywOo();
		int[] testArray = {3, 1, 9};
		int sumOfDifferences = 8;
		int resultSum = undertest.produceSumOfDifferences(testArray);
		assertEquals(sumOfDifferences, resultSum);
		
		int[] testArray2 = {3};
		int resultantZero = undertest.produceSumOfDifferences(testArray2);
		assertEquals(resultantZero, 0);
	}
}

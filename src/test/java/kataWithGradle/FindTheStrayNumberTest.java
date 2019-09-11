package kataWithGradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindTheStrayNumberTest {
	
	@Test
	public void printArrayZeroIndex() {
		int[] testNumbers = new int[3];
		FindTheStrayNumber strayFinder = new FindTheStrayNumber(testNumbers);
		strayFinder.zeroIndexPrinter();
		assertEquals(testNumbers[0], 0);
	}
	
	@Test
	public void sortArray() {
		int[] testNumbers = new int[] {8, 19, 0};
		FindTheStrayNumber strayFinder = new FindTheStrayNumber(testNumbers);

		strayFinder.zeroIndexPrinter();
		assertEquals(testNumbers[0], 0);
	}
	
	@Test
	public void printFinalIndex() {
		int[] testNumbers = new int[] {8, 19, 0};
		FindTheStrayNumber strayFinder = new FindTheStrayNumber(testNumbers);
		int L = testNumbers.length;
		
		strayFinder.finalIndexPrinter();
		assertEquals(testNumbers[L-1], 19);
	}
	
	@Test
	public void printOddNumberOut() {
		int[] testNumbers = new int[] {1, 0, 1, 1, 1, 1, 1, 1};
		FindTheStrayNumber strayFinder = new FindTheStrayNumber(testNumbers);
		
		strayFinder.oddNumberReturner();
		assertEquals(testNumbers[0], 0);
	}
	
	@Test
	public void printOddNumberOut2() {
		int[] testNumbers = new int[] {1, 8, 1, 1, 1, 1, 1};
		FindTheStrayNumber strayFinder = new FindTheStrayNumber(testNumbers);
		
		strayFinder.oddNumberReturner();
		assertEquals(testNumbers[0], 1);
	}
}

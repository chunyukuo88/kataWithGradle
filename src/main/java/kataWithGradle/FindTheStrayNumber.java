/*
 * From the Codewars.com kata titled "Find the stray number"
 * https://www.codewars.com/kata/find-the-stray-number/train/java
 * Completed September 10, 2019.
 * */

package kataWithGradle;

import java.util.Arrays;

public class FindTheStrayNumber {

	int[] theNumbers;
			
	public FindTheStrayNumber(int[] numbers) {
		this.theNumbers = numbers;
	}

	public int zeroIndexPrinter() {
		Arrays.sort(theNumbers);
		return theNumbers[0];
	}
	
	public int finalIndexPrinter() {
		Arrays.sort(theNumbers);
		int L = theNumbers.length;
		return theNumbers[L-1];
	}

	public int oddNumberReturner() {
		Arrays.sort(theNumbers);
		int L = theNumbers.length;
		if (theNumbers[L-1] == theNumbers[L-2])
			return theNumbers[0];
		else
			return theNumbers[L-1];
	}
	
	
}
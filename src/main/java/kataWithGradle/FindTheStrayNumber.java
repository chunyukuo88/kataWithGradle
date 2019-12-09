/*
 * From the Codewars.com kata titled "Find the stray number"
 * https://www.codewars.com/kata/find-the-stray-number/train/java
 * Completed .
 * */

package kataWithGradle;

import java.util.Arrays;

public class FindTheStrayNumber {

	public int stray(int[] numbers) {
		Arrays.sort(numbers);
		int centralNumber = numbers[numbers.length/2];
		if (numbers[0] == centralNumber) {
			return numbers[numbers.length-1];
		} else {
			return numbers[0];
		}
	}
}
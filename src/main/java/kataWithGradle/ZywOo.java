// Challenge:
// https://www.codewars.com/kata/sum-of-differences-in-array/train/java

// Solved at 00:28 on November 23, 2019.

package kataWithGradle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ZywOo {

	public int[] sortAscending(int[] inputArray) {
		Arrays.sort(inputArray);
		return inputArray;
	}

	public int[] sortDescending(int[] inputArray) {
		Arrays.sort(inputArray);
		ArrayList<Integer> resultList = new ArrayList<>();
		
		for (int i = 0; i < inputArray.length; i++) {
			resultList.add(inputArray[i]);
		}
		
		Collections.reverse(resultList);
		int[] resultArray = new int[resultList.size()];
		
		int index = 0;
		for (int number : resultList) {
			resultArray[index] = number;
			index++;
		}

		return resultArray;
	}

	public int returnZero(int[] testArray) {
		if (testArray.length == 1 || testArray.length == 0) {
			return 0;			
		} else {
			return 1;
		}
	}

	public int[] produceDifferences(int[] inputArray) {
		int[] sortedArray = sortDescending(inputArray);

		int[] resultArray = new int[sortedArray.length - 1];
		for (int i = 0; i < (sortedArray.length - 1); i++) {
			resultArray[i] = (sortedArray[i] - sortedArray[i + 1]);
		}
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}
		return resultArray;
		
	}

	public int produceSumOfDifferences(int[] inputArray) {
		if (inputArray.length == 0 || inputArray.length == 1) {
			return 0;
		} else {
		int[] numbersForSummation = produceDifferences(inputArray);
		int resultSum = 0;
		for (int i = 0; i < numbersForSummation.length; i++) {
			resultSum += numbersForSummation[i];
		}
		return resultSum;
		}
	}
	

}

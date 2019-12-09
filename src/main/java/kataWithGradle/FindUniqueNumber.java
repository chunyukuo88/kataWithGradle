package kataWithGradle;

import java.util.Arrays;

public class FindUniqueNumber {

	public int[] produceSortedArray(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	public int findUniq(int[] arr) {
		Arrays.sort(arr);
		int first = arr[0];
		int last = arr[arr.length];
		
		int firstIncrementor = 0;
		int lastIncrementor = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==first) {
				firstIncrementor++;
			} else {
				lastIncrementor++;
			}
		}
		
		System.out.println("Number of zeroes: " + firstIncrementor);
		System.out.println("Number of ones: " + lastIncrementor);
		
		if (firstIncrementor > lastIncrementor) {
			return last;
		} else {
			return first;
		}
	}

	
}

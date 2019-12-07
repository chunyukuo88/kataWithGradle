package kataWithGradle;

import java.util.Arrays;

public class FindUniqueNumber {

	public int[] produceSortedArray(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	public double findUniq(double[] arr) {
		Arrays.sort(arr);
		double first = arr[0];
		double last = arr[arr.length];
		
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

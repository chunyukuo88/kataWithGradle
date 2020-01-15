package kataWithGradle;

import java.util.Arrays;

public class Isograms {

	public String[] produceSortedArray(String input) {
		String[] inputAsArray = input.toLowerCase().split("");
		Arrays.sort(inputAsArray);
		return inputAsArray;
	}

	public boolean isIsogram(String str) {
		String[] sortedInput = produceSortedArray(str);

		
		
		int result = 0;
		for (int i = 0; i < sortedInput.length-1; i++) {
			if (sortedInput[i].equals(sortedInput[i+1]))
				result += 1;
		}
		
		System.out.println("Result: " + result);
		if (result == 0) 
			return true;
		else
			return false;
	}
	
}

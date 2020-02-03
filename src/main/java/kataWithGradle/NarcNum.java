package kataWithGradle;

import java.util.Arrays;
import java.util.List;

public class NarcNum {

	public int findIntegerLength(int input) {
		return Integer.toString(input)
					  .split("")
					  .length;
	}

	public int exponentsForEachDigit(int input) {
		String[] inputAsArray = Integer.toString(input).split("");
		int result = 0;
		for (int i = 0; i < inputAsArray.length; i++) {
			int toBeConverted = Integer.parseInt(inputAsArray[i]);
			result += (Math.pow((double) toBeConverted, (double) findIntegerLength(input)));
		}
		return result;
	}

	public boolean isNarcNum(int input) {
		return input == exponentsForEachDigit(input);
	}

}

// From Codewars
// https://www.codewars.com/kata/55f2b110f61eb01779000053
// 

package kataWithGradle;

import java.util.Arrays;

public class SumOfNumbers {

	public static int[] createArray(int a, int b) {
		int[] resultArray = {a, b};
		Arrays.sort(resultArray);
		return resultArray;
	}

	public static int produceSum(int a, int b) {
		int[] resultArray = new int[2];
		resultArray[0] = a;
		resultArray[1] = b;
		Arrays.sort(resultArray);
		int result = 0;

		for (int k = resultArray[0]; k < (resultArray[1] + 1); k++) {
			result += k;
			System.out.println(k);
		}
		return result;
	}
	
}
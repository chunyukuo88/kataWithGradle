package kataWithGradle;

public class DigitalRoot {

	public int sumOfDigits(int input) {
		String[] arr = String.valueOf(input).split("");
		int result = 0;
		for (int i = 0; i < arr.length; i++)
			result += Integer.valueOf(arr[i]);
		return result;
	}

	public int digital_root(int input) {
		
		int result = sumOfDigits(input);
		while (result > 9)
			result = sumOfDigits(result);
		return result;
	}

}

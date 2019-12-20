package kataWithGradle;

public class PalindromeChecker {

	public static String reverser(String input) {
		String result = "";
		String[] inputAsArray = input.split("");
		for (int i = inputAsArray.length - 1; i > -1; i--) {
			result += inputAsArray[i];
		}
		System.out.println("Result is " + result);
		return result;
	}

	public static boolean checkForPalindrome(String input) {
		String reversedInput = reverser(input);
		if (reversedInput.equals(input)) {
			return true;
		} else 
			return false;
	}

}

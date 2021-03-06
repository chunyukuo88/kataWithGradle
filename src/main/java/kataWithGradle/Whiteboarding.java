//https://github.com/AlanKostrick/whiteboarding-problems/blob/master/README.md

package kataWithGradle;

import java.util.Arrays;

public class Whiteboarding {

//	Problem #1: 
//	Write a method that takes on a string and adds the first character to the end of the string.
	
	
	public String firstToLast(String testString) {
		String newString = testString + testString.charAt(0);
		return newString;
	}

//	Problem #2:
//	Write a method that switches the first and last characters in a string.
	
	public String switchFirstAndLast(String sourceString) {
		String[] splitString = sourceString.split("");
		int lengthOfStringArray = splitString.length;
		String resultString = splitString[lengthOfStringArray - 1] + "";
		for (int i = 1; i < (splitString.length - 1); i++) {
			resultString += splitString[i];
		}
		resultString += sourceString.charAt(0);
		return resultString;
	}

	
//	Problem #3:
//	Write a method that puts a string in reverse. 
	
	public String reverse(String testString) {
		String result = "";
		for (int i = testString.length() - 1; i > -1 ; i--) {
			result += testString.charAt(i);
		}
		return result;
	}



//	Problem #4:
//	Write a method that counts the number of even numbers in the array nums.
	
	public int countTheEvens(int[] testArray) {
		int result = 0;
		for (int i = 0; i < testArray.length; i++) {
			if (testArray[i] % 2 == 0) {
				result++;
			}
			
		}
		return result;
	}

	public int countTheVowels(String testString) {
		int numberOfVowels = 0;
		for (int i = 0; i < testString.length(); i++) {
			switch (testString.charAt(i)) {
			case 'a': numberOfVowels++; break;
			case 'e': numberOfVowels++; break;
			case 'i': numberOfVowels++; break;
			case 'o': numberOfVowels++; break;
			case 'u': numberOfVowels++; break;
						default:
				break;
			}
		}
		return numberOfVowels;
	}

	public boolean checkForThrees(int[] testArray) {
		int result = 0;
		for (int i = 0; i < testArray.length; i++) {
			if (testArray[i] == 3) {
				result++;
			}
		}
		
		if (result == 3) {
			return true;
		} else {
		return false;
		}
	}

	public boolean checkForConsecutiveThrees(int[] testArray) {
		for (int i = 1; i < testArray.length; i++) {
			if (testArray[i] == testArray[i-1]) {
				return false;
			}
		}
		return true;
	}

	public boolean checkForNonconsecutiveThrees(int[] testArray) {
		if (checkForThrees(testArray) == true && checkForConsecutiveThrees(testArray) == true) {
			return true;
		}
		return false;
	}

//	{X, Y, Z}
	public int[] leftShift(int[] testArray) {
		
		int finalElementIndex = testArray.length - 1;
		int[] result = new int[testArray.length];
		
		for (int i = 1; i < testArray.length; i++) {
			result[i-1] = testArray[i];
		}
		result[finalElementIndex] = testArray[0];
		
		return result;
		
	}

//	"ss" 				= 2
//	"Assist Cabass"		= 13
	int countSubstrings(String s, String b) {
		int count = 0;
		for (int i = 0; i < b.length() - s.length() + 1; i++) {
			String bSubstring = b.substring(i, i + s.length());
			if (bSubstring.equals(s)) {
				count++;
			}
		}
		return count;
	}

	public boolean determineIfPrime(int input) {
		boolean result = true;
		
		if (input == 1)
			return result;
		else {
			for (int i = input-1; i > 1; i--) {
				if (input % i == 0)
					result = false;
					break;
			}
			return result;
		}
		
	}

	public int sumOfDigitCubes(int number) {
		String[] stringArray = Integer.toString(number)
									  .split("");
		int result = 0;
		for (int i = 0; i < stringArray.length; i++) {
			int cube = (Integer.parseInt(stringArray[i])) * 
					   (Integer.parseInt(stringArray[i])) * 
					   (Integer.parseInt(stringArray[i]));
			result += cube;
		}
		System.out.println(result);
		return result;
	}

	public int armstrong(int number) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

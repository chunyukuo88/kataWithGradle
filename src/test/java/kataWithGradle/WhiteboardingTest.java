package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhiteboardingTest {

//	Problem #1: 
//	Write a method that takes on a string and adds the first character to the end of the string.
	
	@Test
	public void canAttachFirstCharToEndOfString() {
		Whiteboarding underTest = new Whiteboarding();
		String testString = "1010";
		String result = underTest.firstToLast(testString);
		assertEquals(result, "10101");
	}
	
//	Problem #2:
//	Write a method that switches the first and last characters in a string.

	@Test
	public void canSwitchFirstAndLastChars() {
		Whiteboarding underTest = new Whiteboarding();
		String testString = "12345";
		String result = underTest.switchFirstAndLast(testString);
		assertEquals(result, "52341");
	}
	
//	Problem #3:
//	Write a method that puts a string in reverse. 
	
	@Test
	public void canReverseString() {
		Whiteboarding underTest = new Whiteboarding();
		String testString = "12345";
		String result = underTest.reverse(testString);
		assertEquals(result, "54321");
	}
	
//	Problem #4:
//	Write a method that counts the number of even numbers in the array nums.
	
	@Test
	public void canCountEvenNums() {
		Whiteboarding underTest = new Whiteboarding();
		int[] testArray = {2, 2, 2, 1};
		int result = underTest.countTheEvens(testArray);
		assertEquals(result, 3);
	}
	
//	Problem #5:
//	Write a method that counts the number of vowels in a string. 
	
	@Test
	public void canCountVowels() {
		Whiteboarding underTest = new Whiteboarding();
		String testString = "The Woobler";
		int result = underTest.countTheVowels(testString);
		assertEquals(result, 4);
	}
	
//	Problem #6:
//	Given an array of ints, return true if the value 3 appears 
//	in the array exactly 3 times, and no 3's are next to each other.
	
	@Test
	public void canConfirmPresenceOfThreeThrees() {
		Whiteboarding underTest = new Whiteboarding();
		int[] testArray1 = {2, 2, 2, 1};
		int[] testArray2 = {3, 0, 3, 0, 3};
		boolean result1 = underTest.checkForThrees(testArray1);
		boolean result2 = underTest.checkForThrees(testArray2);
		
		assertEquals(result1, false);
		assertEquals(result2, true);
	}
	
	@Test
	public void canConfirmTheThreesAreNotConsecutive() {
		Whiteboarding underTest = new Whiteboarding();
		int[] testArray1 = {3, 3, 3, 3, 3};
		int[] testArray2 = {3, 0, 3, 0, 3};
		
		boolean result1 = underTest.checkForConsecutiveThrees(testArray1);
		boolean result2 = underTest.checkForConsecutiveThrees(testArray2);
		
		assertEquals(result1, false);
		assertEquals(result2, true);
	}
	
	@Test
	public void canTestForThreeNonconsecutiveThrees() {
		Whiteboarding underTest = new Whiteboarding();
		int[] testArray1 = {3, 3, 1, 1, 3};
		int[] testArray2 = {3, 0, 3, 0, 3};
		
		boolean result1 = underTest.checkForNonconsecutiveThrees(testArray1);
		boolean result2 = underTest.checkForNonconsecutiveThrees(testArray2);
		
		assertEquals(result1, false);
		assertEquals(result2, true);
	}
	
//	Problem #7:
//	Return an array that is "left shifted" by one -- so {6, 2, 5, 3} 
//	returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
	
	@Test
	public void canLeftShift() {
		Whiteboarding underTest = new Whiteboarding();
		int[] testArray = {1, 2, 3, 4, 5};
		int[] resultArray = underTest.leftShift(testArray);
		int[] leftShifted = {2, 3, 4, 5, 1};
		assertArrayEquals(resultArray, leftShifted);
	}
	
//  Problem #8:
//	Return the number of places where a substring appears in a string.
	@Test
	public void countNumberOfSubstrings() throws Exception {
		Whiteboarding underTest = new Whiteboarding();
		String s = "__"; 			// s.length() = 2;
		String b = "__        __";  // b.length() = 13;
		int result = underTest.countSubstrings(s, b);
		int expectedOutput = 2;
		assertEquals(result, expectedOutput);
	}
	
	@Test
	public void countSubstringsWhenBothAreTheSame() throws Exception {
		Whiteboarding underTest = new Whiteboarding();
		String s = "123";
		String b = "123";
		int result = underTest.countSubstrings(s, b);
		int expectedOutput = 1;
		assertEquals(result, expectedOutput);
	}
	
//	Problem #9: Check if a number is a prime number.
	
	@Test
	public void determineIfPrime() throws Exception {
		Whiteboarding underTest = new Whiteboarding();
		int input1 = 6;
		boolean result1 = underTest.determineIfPrime(input1);
		boolean expectedOutput1 = true;
		assertEquals(result1, expectedOutput1);
		
		int input2 = 13;
		boolean result2 = underTest.determineIfPrime(input2);
		boolean expectedOutput2 = true;
		assertEquals(result2, expectedOutput2);
		
		int input3 = 1;
		boolean result3 = underTest.determineIfPrime(input3);
		boolean expectedOutput3 = true;
		assertEquals(result3, expectedOutput3);
	}
	
//	Problem #10: Check if Armstrong number.
//	A number is called an Armstrong number 
//	if it is equal to the cube of its every digit.
	
	@Test
	public void canProduceSumOfCubesOfEachDigit() throws Exception {
		Whiteboarding underTest = new Whiteboarding();
		int number = 123; // 1 + 8 + 27 = 36
		int result = underTest.sumOfDigitCubes(number);
		assertEquals(result, 36);
	}
	
	@Test
	public void canDetermineIfTheInputIsAnArmstrongNumber() throws Exception {
		Whiteboarding underTest = new Whiteboarding();
		int number = 123; // 1 + 8 + 27 = 36
		int result = underTest.armstrong(number);
		assertEquals(result, 36);
	}
}

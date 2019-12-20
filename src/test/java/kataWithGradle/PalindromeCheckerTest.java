package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeCheckerTest {

//	@Test
	public void canProduceBackwardsString() throws Exception {
		PalindromeChecker underTest = new PalindromeChecker();
		String result = PalindromeChecker.reverser("12345678");
		assertEquals("87654321", result);
	}
	
	@Test
	public void canCheckIfInputIsPalindrome() throws Exception {
		PalindromeChecker underTest = new PalindromeChecker();
		boolean result1 = PalindromeChecker.checkForPalindrome("12345678");
		assertEquals(false, result1);
		
		boolean result2 = PalindromeChecker.checkForPalindrome("10101");
		assertEquals(true, result2);
	}
}

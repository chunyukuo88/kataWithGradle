package kataWithGradle;
//  This kata is from 
//  https://www.codewars.com/kata/roman-numerals-encoder/train/java

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralatorTest {

//	@Test
//	public void canConvertSingleDigitNumbers() {
//		RomanNumeralator underTest = new RomanNumeralator();
//		String result1 = underTest.convertOnesDigit(3);
//		assertEquals(result1, "III");
//		
//		String result2 = underTest.convertOnesDigit(4);
//		assertEquals(result2, "IV");
//		
//		String result3 = underTest.convertOnesDigit(5);
//		assertEquals(result3, "V");
//		
//		String result4 = underTest.convertOnesDigit(8);
//		assertEquals(result4, "VIII");
//		
//		String result5 = underTest.convertOnesDigit(10);
//		assertEquals(result5, "X");
//	}
	
	@Test
	public void canConvertTwoDigitNumbers() {
		RomanNumeralator underTest = new RomanNumeralator();
		String result1 = underTest.solution(33);
		assertEquals(result1, "XXXIII");
		
		String result2 = underTest.solution(49);
		assertEquals(result2, "XLIX");
		
		String result3 = underTest.solution(66);
		assertEquals(result3, "LXVI");
		
		String result4 = underTest.solution(81);
		assertEquals(result4, "LXXXI");
		
		String result5 = underTest.solution(99);
		assertEquals(result5, "XCIX");
	}
	
	@Test
	public void canConvertThreeDigitNumbers() {
		RomanNumeralator underTest = new RomanNumeralator();
		
		String result1 = underTest.solution(111);
		assertEquals(result1, "CXI");
		
		String result2 = underTest.solution(464);
		assertEquals(result2, "CDLXIV");
		
		String result3 = underTest.solution(596);
		assertEquals(result3, "DXCVI");
		
		String result4 = underTest.solution(909);
		assertEquals(result4, "CMIX");
		
		String result5 = underTest.solution(999);
		assertEquals(result5, "CMXCIX");
	}
}

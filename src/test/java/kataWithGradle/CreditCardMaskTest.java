package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditCardMaskTest {

	@Test
	public void canAccountForShortStrings() {
		CreditCardMask underTest = new CreditCardMask();
		String input1 = "f";
		String input2 = "";
		String result1 = underTest.processShortStrings(input1);
		String result2 = underTest.processShortStrings(input2);
		assertEquals(input1, result1);
		assertEquals(input2, result2);
	}
	
	@Test
	public void canProduceMaskedArray() {
		CreditCardMask underTest = new CreditCardMask();
		String input1 = "Spiderman";
		String[] maskedArray = {"#","#","#","#","#","r","m","a","n"};
		String[] result = underTest.produceMaskArray(input1);
		assertArrayEquals(maskedArray, result);
	}
	
	@Test
	public void canAccountForAllStrings() {
		CreditCardMask underTest = new CreditCardMask();
		
		String input1  = "Cowbell";
		String result1 = "###bell";
		String output1 = underTest.maskify(input1);
		assertEquals(result1, output1);

		String input2 = "f";
		String result2 = "f";
		String output2 = underTest.maskify(input2);
		assertEquals(result2, output2);

		String input3 = "";
		String result3 = "";
		String output3 = underTest.maskify(input3);
		assertEquals(result3, output3);	
		
	}
	
}

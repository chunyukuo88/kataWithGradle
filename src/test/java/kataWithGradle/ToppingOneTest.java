package kataWithGradle;
/* 
codingbat.com: 
https://codingbat.com/prob/p182712
 
Given a map of food keys and topping values, modify and return the map as 
follows: if the key "ice cream" is present, set its value to "cherry". In
all cases, set the key "bread" to have the value "butter".
*/

import static org.junit.Assert.*;
import java.util.HashMap;
import org.junit.Test;

public class ToppingOneTest {
	
//	@Test
	public void canAccountForBread() throws Exception {
		ToppingOne underTest = new ToppingOne();
		HashMap<String, String> input1 = new HashMap<>(); 
		input1.put("ice cream", "peanuts");
		input1.put("bread", "syrup");
		String expectedOutput1 = underTest.topping1(input1, "bread");
		assertEquals(expectedOutput1, "butter");
		
	}
	
//	@Test
	public void canAccountForIceCream() throws Exception {
		ToppingOne underTest = new ToppingOne();
		HashMap<String, String> input2 = new HashMap<>(); 
		input2.put("dogs", "peanuts");
		input2.put("pancakes", "syrup");
		String expectedOutput2 = underTest.topping1(input2, "ice cream");
		assertEquals(expectedOutput2, "cherry");
	}
	
	@Test
	public void canAccountForBreadAndIceCream() throws Exception {
		ToppingOne underTest = new ToppingOne();
		HashMap<String, String> input = new HashMap<>(); 
//		input.put("ice cream", "peanuts");
		input.put("pancake", "syrup");
		HashMap<String, String> result = underTest.topping1(input);
		HashMap<String, String> expectedOutput = new HashMap<String, String>();
			expectedOutput.put("pancake", "syrup");
			expectedOutput.put("ice cream","cherry");
			expectedOutput.put("bread","butter");
		assertEquals(result, expectedOutput);
	}
}

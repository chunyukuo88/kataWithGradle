package kataWithGradle;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class TopWordsTest {

//	@Test
	public void canProduceMapWithTallies() throws Exception {
		TopWords underTest = new TopWords();
		String input = "The cat and the dog";
		String[] inputArray = input.split(" ");
		HashMap<String, Integer> result = underTest.produceTallies(input);
		HashMap<String, Integer> expectedOutput = new HashMap<>();
			expectedOutput.put("the", 2);
			expectedOutput.put("cat", 1);
			expectedOutput.put("and", 1);
			expectedOutput.put("dog", 1);
		assertTrue(result.keySet().equals(expectedOutput.keySet())); 
	}
	
	@Test
	public void canProduceTheTop3MostCommon() throws Exception {
		TopWords underTest = new TopWords();
		String input = "The the the the and and and house house to of";
		String[] inputArray = input.split(" ");
		ArrayList<String> result = underTest.top3(input);
		ArrayList<String> expectedOutput = new ArrayList<>();
			expectedOutput.add("the");
			expectedOutput.add("and");
			expectedOutput.add("house");
		assertEquals(result, expectedOutput); 
	}
}

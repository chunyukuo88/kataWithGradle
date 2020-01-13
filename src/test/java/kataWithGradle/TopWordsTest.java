package kataWithGradle;

import static org.junit.Assert.*;

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
		
		
		String input2 = "The and and";
		String[] inputArray2 = input2.split(" ");
		ArrayList<String> result2 = underTest.top3(input2);
		ArrayList<String> expectedOutput2 = new ArrayList<>();
			expectedOutput2.add("and");
			expectedOutput2.add("the");
		assertEquals(result2, expectedOutput2);
		
		
		String input3 = "and and";
		String[] inputArray3 = input3.split(" ");
		ArrayList<String> result3 = underTest.top3(input3);
		ArrayList<String> expectedOutput3 = new ArrayList<>();
			expectedOutput3.add("and");
		assertEquals(result3, expectedOutput3);
		
		
		String input4 = "";
		String[] inputArray4 = input4.split(" ");
		ArrayList<String> result4 = underTest.top3(input4);
		ArrayList<String> expectedOutput4 = new ArrayList<>();
		//Don't add anything
		assertEquals(result4, expectedOutput4);
	}
	

}

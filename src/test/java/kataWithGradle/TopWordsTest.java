package kataWithGradle;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class TopWordsTest {

	@Test
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
}

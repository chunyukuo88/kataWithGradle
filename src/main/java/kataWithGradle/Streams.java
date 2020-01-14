package kataWithGradle;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class Streams{

	public int[] produceEvens(ArrayList<Integer> givenList) {
		
		List<Integer> result = givenList.stream().filter(x->x%2==0).collect(toList());
		
		int[] evenNumbers = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			evenNumbers[i] = result.get(i);
		}
		
		return evenNumbers;
	}

	public List<String> capitalizer(List<String> inputList) {
		List<String> output = inputList.stream()
									   .map(word->word.toUpperCase())
//									   .map(String::toUpperCase()) //-----This worked in https://technologyconversations.com/2014/11/04/java-8-streams-micro-katas/
									   .collect(toList());
		return output;
	}	

}
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

}
package kataWithGradle;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {

	public ArrayList<Integer> produceSequence(int iterations) {
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1, 1));
		
		for (int i = 1; i < iterations - 1; i++) {
			int newNumber = (result.get(i) + result.get(i-1));
			System.out.println(newNumber);
			result.add(newNumber);
		}
		
		return result;
	}

	public ArrayList<Integer> withinCeiling(int limit) {
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1, 1));
		int size = result.size();
		
		for (int i = 1; result.get(i) < limit; i++) {
			int newNumber = (result.get(i) + result.get(i-1));
			System.out.println(newNumber);
			result.add(newNumber);
		}
		
		return result;
	}
	
}

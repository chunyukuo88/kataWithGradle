package kataWithGradle;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class FibonacciTest {

//	@Test
	public void canProduceNIterationsOfFibonacci() throws Exception {
		Fibonacci underTest = new Fibonacci();
		int iterations = 6;
		ArrayList<Integer> result = underTest.produceSequence(iterations);
		ArrayList<Integer> expectedOutput = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 5, 8));
		assertEquals(result, expectedOutput);
	}
	
	@Test
	public void canProduceFibonacciUntilN() throws Exception {
		Fibonacci underTest = new Fibonacci();
		int limit = 13;
		ArrayList<Integer> result = underTest.withinCeiling(limit);
		ArrayList<Integer> expectedOutput = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 5, 8, 13));
		assertEquals(result, expectedOutput);
		
	}
}

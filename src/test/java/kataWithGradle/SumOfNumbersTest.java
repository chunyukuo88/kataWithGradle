package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	@Test
	public void returnNumbersAsSortedArray() {
		SumOfNumbers underTest = new SumOfNumbers();
		int[] result = SumOfNumbers.createArray(4, -3);
		int[] expectedArray = {-3, 4};
		assertArrayEquals(result, expectedArray);
	}
	
	@Test
	public void canAddNumbersBetweenAAndB() {
		SumOfNumbers underTest = new SumOfNumbers();
		int result = SumOfNumbers.produceSum(5, 0);
		assertEquals(result, 15);
	}
	
	@Test
	public void canProduceResultWhenNumsAreEqual() {
		SumOfNumbers underTest = new SumOfNumbers();
		int result = SumOfNumbers.produceSum(5, 5);
		assertEquals(result, 5);
	}

}

package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseNumbersTest {

	@Test
	public void canProduceSumOfArray() throws Exception {
		HouseNumbers underTest = new HouseNumbers();
		int[] input = {1 , 2 , 3};
		int result = underTest.addElements(input);
		assertEquals(result, 6);
	}
	
	@Test
	public void canStopAtZero() {
		HouseNumbers underTest = new HouseNumbers();
		int[] input = {1 , 2 , 3, 0, 1000, 4};
		int result = underTest.houseNumbersSum(input);
		assertEquals(result, 6);
	}
}

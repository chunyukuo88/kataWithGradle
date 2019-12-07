package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindUniqueNumberTest {

	@Test
	public void canSortArray() {
		FindUniqueNumber underTest = new FindUniqueNumber();
		int[] arr = new int[] {0, 1, 0};
		int[] result = underTest.produceSortedArray(arr);
		int[] sortedArray = new int[]{0, 0, 1};
		assertArrayEquals(result, sortedArray);
	}
	
	@Test
	public void canProduceOddOneOut() {
		FindUniqueNumber underTest = new FindUniqueNumber();
		int[] arr = new int[] {0, 1, 0, 0};
		int result = 1;
		int oddOneOut = underTest.findUniq(arr);
		assertEquals(result, oddOneOut);
	}
	
//	The `double` primitive data type seems to cause a lot of problems in Java.
//	Look into that!
	@Test
	public void canProduceOddOneOutWithDouble() {
		FindUniqueNumber underTest = new FindUniqueNumber();
		double[] arr = new double[] {0, 1, 0, 0};
		double result = 1;
		double oddOneOut = underTest.findUniq(arr);
		assertEquals(result, oddOneOut);
	}
}

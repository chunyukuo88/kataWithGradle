package kataWithGradle;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DescendingOrderTest {

	@Test
	public void canConvertIntegerToArray() {
		DescendingOrder underTest = new DescendingOrder();
		int[] output = underTest.convertToArray(12345);
		int[] expectedResult = {1, 2, 3, 4, 5};
		assertArrayEquals(output, expectedResult);
	}
	
	@Test
	public void canReturnIntegerAsSortedInDescendingOrder() {
		DescendingOrder underTest = new DescendingOrder();
		int[] output = underTest.convertToDescendingArray(12345);
		int[] expectedResult = {5, 4, 3, 2, 1};
		assertArrayEquals(output, expectedResult);		
	}
	
	@Test
	public void canReturnIntegerWithSortedDigits() {
		DescendingOrder underTest = new DescendingOrder();
		int output = underTest.convertToDescendingDigits(11911);
		int expectedResult = 91111;
		assertEquals(output, expectedResult);	
	}
}

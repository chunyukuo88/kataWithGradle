package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChocolateBarTest {

	@Test
	public void returnZeroIfOneByOneBar() throws Exception {
		ChocolateBar underTest = new ChocolateBar();
		int result = underTest.singleSquare(1, 1);
		assertEquals(0, result);
	}
	
	@Test
	public void returnOneIfTwoByOneBar() throws Exception {
		ChocolateBar underTest = new ChocolateBar();
		int result = underTest.twoSquares(2, 1);
		assertEquals(1, result);
	}
	
	@Test
	public void canProduceBreaksForSquareNumbers() throws Exception {
		ChocolateBar underTest = new ChocolateBar();
		int result1 = underTest.squareNumbers(2, 2);
		assertEquals(3, result1);
		
		int result2 = underTest.squareNumbers(4, 4);
		assertEquals(15, result2);
		
		int result3 = underTest.squareNumbers(9, 9);
		assertEquals(80, result3);		
	}
	
	@Test
	public void canProduceBreaksForAllDimensions() throws Exception {
		ChocolateBar underTest = new ChocolateBar();
		int result1 = underTest.breakChocolate(3, 11);
		assertEquals(32, result1);
		
		int result2 = underTest.breakChocolate(41, 4);
		assertEquals(163, result2);
		
		int result3 = underTest.breakChocolate(1, 1);
		assertEquals(0, result3);		
	}
}

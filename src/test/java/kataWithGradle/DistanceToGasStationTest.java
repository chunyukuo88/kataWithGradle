package kataWithGradle;

//From codewars: https://www.codewars.com/kata/will-you-make-it/train/java


import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceToGasStationTest {
//	You know that on average, your car runs on about 25 miles per gallon.
//							zeroFuel(distanceToPump, mpg, fuelLeft){}
	
	@Test
	public void canCalculateDistanceToPump() throws Exception {
		DistanceToGasStation underTest = new DistanceToGasStation();
		
		boolean result = underTest.zeroFuel(50, 25, 2);
		boolean expectedOutput = true;
		assertEquals(result, expectedOutput);
		
		boolean result2 = underTest.zeroFuel(100, 50, 1);
		boolean expectedOutput2 = false;
		assertEquals(result2, expectedOutput2);
	}
}

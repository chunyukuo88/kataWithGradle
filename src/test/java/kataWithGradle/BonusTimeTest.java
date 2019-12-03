// From Codewars
// https://www.codewars.com/kata/do-i-get-a-bonus/train/java

package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class BonusTimeTest {

	@Test
	public void canCalculateSalary() {
		BonusTime underTest = new BonusTime();
		String output = underTest.calculateSalary(100_000, true);
		String result = "£1000000";
		assertEquals(output, result);
	}
}

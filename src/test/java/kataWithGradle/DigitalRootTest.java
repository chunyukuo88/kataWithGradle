package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitalRootTest {

//	@Test
	public void canProduceSumOfDigits() throws Exception {
		DigitalRoot underTest = new DigitalRoot();
		int input = 30003;
		int output = underTest.sumOfDigits(input);
		assertEquals(output, 6);
		
		int input2 = 91119;
		int output2 = underTest.sumOfDigits(input2);
		assertEquals(output2, 21);
	}
	
	@Test
	public void canProduceDigitalRoot() throws Exception {
		DigitalRoot underTest = new DigitalRoot();
		int input = 30903;
		int output = underTest.digital_root(input);
		assertEquals(output, 6);
		
		int input2 = 999;
		int output2 = underTest.digital_root(input2);
		assertEquals(output2, 9);
	}
}

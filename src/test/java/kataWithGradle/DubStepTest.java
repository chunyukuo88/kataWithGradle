package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class DubStepTest {

	@Test
	public void canSplitInputStringWithWubs() throws Exception {
		DubStep underTest = new DubStep();
		String[] output = underTest.splitInput("WUBWUBHOWZITWUBHOWZIT");
		String[] result = {"", "", "HOWZIT", "HOWZIT"};
		assertArrayEquals(output, result);
	}
	
	@Test
	public void canDecodeDubstep() {
		DubStep underTest = new DubStep();
		String result = "HOWZIT HOWZIT";
		String output = underTest.decodeString("WUBHOWZITWUBWUBWUBHOWZITWUBWUB");
		assertEquals(result, output);
	}
}

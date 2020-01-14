package kataWithGradle;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class StreamsTest {

	@Test
	public void canProduceEvenNumbers() throws Exception {
		Streams underTest = new Streams();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		int[] result = underTest.produceEvens(list);
		int[] expectedOutput = new int[]{0,2,4,6,8};
		
		assertArrayEquals(result, expectedOutput);
	}
}

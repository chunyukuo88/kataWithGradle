package kataWithGradle;
//From codingbat: https://codingbat.com/prob/p197888

import static org.junit.Assert.*;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class MapBullyTest {

//	Here I wanted to see if I could use something fancier than the
//	usual approach, i.e. to instantiate with the diamond operator
//	then use the .put() method twice. Yes, I realize this doesn't 
//	involve an instance of the MapBully class.
	@Test
	public void determineIfKeyIsPresent() throws Exception {
		Map<String, String> testMap = Stream.of(new String[][] {
			{"a", "apple"},
			{"b", "bear"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		String result = testMap.get("a");
		assertEquals(result, "apple");
	}
	
	@Test
	public void canSummonBullyWhenAIsPresent() throws Exception {
		MapBully underTest = new MapBully();
		Map<String, String> testMap = Stream.of(new String[][] {
			{"a", "apple"},
			{"b", "bear"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		String result = underTest.mapBully(testMap).get("b");
		assertEquals(result, "apple");
	}
	
	@Test
	public void canSummonBullyWhenAIsAbsent() throws Exception {
		MapBully underTest = new MapBully();
		Map<String, String> testMap = Stream.of(new String[][] {
			{"b", "bear"},
			{"c", "cars"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		String result = underTest.mapBully(testMap).get("b");
		assertEquals(result, "bear");
	}
}

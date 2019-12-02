//https://www.codewars.com/kata/the-office-iv-find-a-meeting-room/train/java

package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheOfficeIVTest {

	@Test
	public void findFirstO() throws Exception {
		TheOfficeIV underTest = new TheOfficeIV();
		char[] testArray = {'X', 'X', 'O', 'X', 'O'};
		int expectedOutput = underTest.meeting(testArray);
		assertEquals(2, expectedOutput);
	}
	
	@Test
	public void canDetermineIfAllRoomsAreFull() {
		TheOfficeIV underTest = new TheOfficeIV();
		char[] testArray = {'X', 'X', 'X', 'X', 'X'};
		String expectedOutput = underTest.allRoomsFull(testArray);
		String result = "None available!";
		assertEquals(result, expectedOutput);
	}
	
	@Test
	public void canProduceEmptyResultOrRoomIndex() {
		TheOfficeIV underTest = new TheOfficeIV();
		char[] testArray1 = {'X', 'X', 'X', 'X', 'X'};
		char[] testArray2 = {'X', 'X', 'O', 'X', 'X'};
		
		Object expectedOutput1 = underTest.fullOrIndex(testArray1);
		Object result1 = "None available!";
		
		Object expectedOutput2 = underTest.fullOrIndex(testArray2);
		Object result2 = 2;
		
		assertEquals(result1, expectedOutput1);
	}
	
	
	
	
}

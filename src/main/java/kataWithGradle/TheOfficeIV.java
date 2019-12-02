package kataWithGradle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TheOfficeIV {

	public int meeting(char[] testArray) {
		int result = 0;
		for (int i = 0; i < testArray.length; i++) {
			if (testArray[i] == 'O') {
				result = i;
				break;
			}
		}
		return result;
	}

	public String allRoomsFull(char[] testArray) {
		int incrementor = 0;
		String result = "None available!";
		for (char c : testArray) {
			if (c == 'O') {
				incrementor++;
			}
		}
		
		if (incrementor == 0) {
			return result;
		} else {
			return null;
		}
	}

	public Object fullOrIndex(char[] inputArray) {
		int incrementor = 0;
		ArrayList<Integer> theList = new ArrayList<Integer>();
		String noneAvailable = "None available!";
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == 'O') {
				incrementor++;
				theList.add(i);
			}
		}
		
		Collections.sort(theList);
		
		if (incrementor == 0) {
			return noneAvailable;
		} else {
			return theList.get(0);
		}
	}

}

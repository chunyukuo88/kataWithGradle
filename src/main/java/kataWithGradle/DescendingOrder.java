package kataWithGradle;
//From Codewars.com -> https://www.codewars.com/kata/5467e4d82edf8bbf40000155
import java.util.Arrays;

public class DescendingOrder {

	public int[] convertToArray(int number) {
		String integerAsString = Integer.toString(number);
		String[] stringArray = integerAsString.split("");
		int[] integerArray = new int[stringArray.length];
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i] = Integer.parseInt(stringArray[i]);
		}
		return integerArray;
	}

	public int[] convertToDescendingArray(int number) {
		String integerAsString = Integer.toString(number);
		String[] stringArray = integerAsString.split("");
		int[] integerArray = new int[stringArray.length];
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i] = Integer.parseInt(stringArray[i]);
		}
		int[] descendingArray = new int[integerArray.length];
		
		int k = 0;
		for (int j = integerArray.length - 1; j > - 1; j--, k++) {
			descendingArray[k] = integerArray[j];
		}
		for (int i = 0; i < descendingArray.length; i++) {
			System.out.println(descendingArray[i]);
		}
		return descendingArray;
	}

	public int convertToDescendingDigits(int num) {
		String integerAsString = Integer.toString(num);
		String[] stringArray = integerAsString.split("");
		int[] integerArray = new int[stringArray.length];
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i] = Integer.parseInt(stringArray[i]);
		}
		Arrays.sort(integerArray);
		int[] descendingArray = new int[integerArray.length];
		
		int k = 0;
		for (int j = integerArray.length - 1; j > - 1; j--, k++) {
			descendingArray[k] = integerArray[j];
		}
		String resultAsString = "";
		for (int i = 0; i < descendingArray.length; i++) {
			resultAsString += descendingArray[i];
		}
		
		int resultAsInteger = Integer.parseInt(resultAsString);
		return resultAsInteger;
	}

	
}

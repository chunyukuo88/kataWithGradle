package kataWithGradle;

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

}

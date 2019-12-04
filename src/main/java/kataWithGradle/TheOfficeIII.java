package kataWithGradle;

public class TheOfficeIII {

	public String broken(String inputString) {
		String outputString = inputString.replace('0', 'z');
		outputString = outputString.replace('1', 'o');
		outputString = outputString.replace('z', '1');
		outputString = outputString.replace('o', '0');
		
		System.out.println("Before: " + inputString);
		System.out.println("After:  " + outputString);
		return outputString;
	}

}

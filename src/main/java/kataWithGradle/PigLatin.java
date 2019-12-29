package kataWithGradle;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class PigLatin {

	public String pigSingleWord(String input) {
		
		String output = "";
		
		for (int i = 1; i < input.length(); i++) {
			output += input.charAt(i);
		}
		
		return output + input.charAt(0) + "ay";
	}

	public String pigIt(String input) {
		
		String[] inputArray = input.split(" ");
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].matches("^[a-zA-Z]*$")) {
				inputArray[i] = pigSingleWord(inputArray[i]);
			}
		}
		
		List<String> outputAsList = new ArrayList<String>();
		for (int i = 0; i < inputArray.length; i++) {
			outputAsList.add(inputArray[i]);
		}
		
		String outputString = String.join(" ", outputAsList);
				
		return outputString;
	}

}

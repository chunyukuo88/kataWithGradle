package kataWithGradle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackspacesInString {

	public String processBlankString(String input) {
		if (input == "")
			return "";
		else
			return null;
	}

	public String poundString(String string) {
		
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != '#')
				result += string.charAt(i);
			else
				result += "";
		}
		
		return result;
	}

	public Object cleanString(String inputString) {
		String[] inputAsArray = inputString.split("");
		List<String> output = Arrays.asList(inputAsArray);
		
		for (int i = 0; i < output.size(); i++) {
			if (output.get(i) == "#") {
				output.remove(i-1);
				output.remove(i);
			}
		}
		
		return output;
	}

	
}

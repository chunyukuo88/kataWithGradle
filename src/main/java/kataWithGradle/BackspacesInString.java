package kataWithGradle;

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

	public Object cleanString(String string) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != '#')
				result += string.charAt(i);
			else
				result -= string.charAt(i-1);
		}
		
		return result;
	}

	
}

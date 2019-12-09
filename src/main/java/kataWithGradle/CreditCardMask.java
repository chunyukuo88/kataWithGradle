package kataWithGradle;

public class CreditCardMask {

	public String processShortStrings(String input) {
		if (input.length() == 1) {
			return input;
		} else
			return "";
	}

	public String[] produceMaskArray(String input) {
		String[] inputAsArray = input.split("");
		String[] result = new String[input.length()];
		for (int i = 0; i < inputAsArray.length - 4; i++) {
			result[i] = "#";
			System.out.print(result[i]);
		}

		for (int i = inputAsArray.length - 4; i < inputAsArray.length; i++) {
			result[i] = inputAsArray[i];
			System.out.print(result[i]);
		}
		return result;
	}

	public String maskify(String str) {
		if (str.length() == 1) {
			return str;
		} else if (str == "") {
			return "";
		} else if (str.length() == 2) {
			return str;
		} else {
			String[] inputAsArray = str.split("");
			String result = "";
			for (int i = 0; i < inputAsArray.length - 4; i++) {
				result += "#";
			}

			for (int i = inputAsArray.length - 4; i < inputAsArray.length; i++) {
				result += inputAsArray[i];
			}
			return result;
		}
	}
}
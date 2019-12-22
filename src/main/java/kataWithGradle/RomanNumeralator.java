package kataWithGradle;

public class RomanNumeralator {

	public String convertOnesDigit(int n) {
		
		String result = "";
		
		if (n < 4) {
			for (int i = 0 ; i < n ; i++) {
				result += "I";
			}
			return result;
		} else if (n == 4) {
			return "IV";
		} else if (n > 4 && n < 9) {
			result = "V";
			for (int i = 5; i < n; i++) {
				result += "I";
			}
			return result;
		} else if (n == 9) {
			return "IX";
		} else if (n == 10) {
			return "X";
		}
		return "Error";
	}

	public String convertTensDigit(int n) {
		
		String inputAsString = Integer.toString(n);
		String[] stringArray = inputAsString.split("");
		int[] intArray = new int[stringArray.length];
		
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		
//		Tens and ones digits, respectively. The tens are calculated below these two declarations.
		int tensDigit = intArray[0];
		
		String result = "";
		if (tensDigit < 4) {
			for (int i = 0; i < tensDigit; i++) {
				result += "X";
			}
			return result;
		} else if (tensDigit == 4) {
			return "XL";
		} else if (tensDigit == 5) {
			return "L";
		} else if (tensDigit > 5 && tensDigit < 9) {
			for (int i = 5; i < tensDigit; i++) {
				result += "X";
			}
			return "L" + result;
		} else if (tensDigit == 9) {
			return "XC";
		}
		return "C";
	}

	public String convertHundredsDigit(int n) {
		
		String inputAsString = Integer.toString(n);
		String[] stringArray = inputAsString.split("");
		int[] intArray = new int[stringArray.length];
		
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		
		int hundredsDigit = intArray[0];
		String result = "";
		
		if (hundredsDigit < 4) {
			for (int i = 0; i < hundredsDigit; i++) {
				result += "C";
			}
			return result;
		} else if (hundredsDigit == 4) {
			return result + "CD";
		} else if (hundredsDigit == 5) {
			return result + "D";
		} else if (hundredsDigit > 5 && hundredsDigit < 9) {
			result += "D";
			for (int i = 5; i < hundredsDigit; i++) {
				result += "C";
			}
			return result + "CD";
		} else if (hundredsDigit == 9) {
			return result + "CM";
		} else
			return "Error";
	}		
	
	public String solution(int n) {
		String inputAsString = Integer.toString(n);
		String[] stringArray = inputAsString.split("");
		int[] intArray = new int[stringArray.length];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		
		if (n < 11)
			return convertOnesDigit(n);
		else if (n == 99)
			return "XCIX";
		else if (n >= 11 && n < 100)
			return convertTensDigit(intArray[0]) + convertOnesDigit(intArray[1]);
		else if (n >= 101 && n < 1000)
			return convertHundredsDigit(intArray[0]) + convertTensDigit(intArray[1]) + convertOnesDigit(intArray[2]);
	return "Error";
	}
}
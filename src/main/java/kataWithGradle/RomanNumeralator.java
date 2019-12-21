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

	public String convertTwoDigitNumber(int n) {
		
		String inputAsString = Integer.toString(n);
		String[] stringArray = inputAsString.split("");
		int[] intArray = new int[stringArray.length];
		
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		
//		Tens and ones digits, respectively. The tens are calculated below these two declarations.
		int tensDigit = intArray[0];
		String onesDigit = convertOnesDigit(intArray[1]);
		
		String result = "";
		if (tensDigit < 4) {
			for (int i = 0; i < tensDigit; i++) {
				result += "X";
			}
			return result + onesDigit;
		} else if (tensDigit == 4) {
			return "XL" + onesDigit;
		} else if (tensDigit == 5) {
			return "L" + onesDigit;
		} else if (tensDigit > 5 && tensDigit < 9) {
			for (int i = 5; i < tensDigit; i++) {
				result += "X";
			}
			return "L" + result + onesDigit;
		}
		return "XCIX";
	}

	
	public String solution(int n) {
		if (n < 11) {
			System.out.println(convertOnesDigit(n));
			return convertOnesDigit(n);
		} else if (n < 100) 
			System.out.println(convertTwoDigitNumber(n));
			return convertTwoDigitNumber(n);
	}
	
}

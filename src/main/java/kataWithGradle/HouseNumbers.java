package kataWithGradle;

public class HouseNumbers {

	public int addElements(int[] input) {
		int result = 0;
		for (int i = 0; i < input.length; i++) {
			result += input[i];
		}
		System.out.println(result);
		return result;
	}

	public int houseNumbersSum(int[] arr) {
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] != 0) {
				result += arr[i];
			} else {
				break;
			}
		}
		System.out.println(result);
		return result;
	}

}

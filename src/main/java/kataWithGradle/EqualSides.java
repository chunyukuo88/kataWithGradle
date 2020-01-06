package kataWithGradle;

public class EqualSides {

	public int indexSums(int[] input, int index) {
		
		int leftSum = 0;
		int rightSum = 0;
		
		for (int i = 0; i < index; i++) {
			leftSum += input[i];
		}
		for (int j = index + 1; j < input.length; j++) {
			rightSum += input[j];
		}
		return leftSum + rightSum;
	}

	public boolean sidesAreEqual(int[] input) {
		int leftSum = 0;
		int rightSum = 0;
		for (int i = 0; i < 2; i++) {
			leftSum += input[i];
		}
		for (int j = 2; j < input.length; j++) {
			rightSum += input[j];
		}
		
		return (leftSum == rightSum) ? true : false;
	}

	public int findEvenIndex(int[] arr) {
		
		int result = -1;
		
		for (int i = 0; i < arr.length; i++) {
			int leftSum = 0;
			for (int j = 0; j < i; j++) {
				leftSum += arr[j];
			}
			int rightSum = 0;
			for (int j = i + 1; j < arr.length; j++) {
				rightSum += arr[j];
			}
//			System.out.println("Left sum: " + leftSum + "\nRight sum: " + rightSum + "\n=========");
			
			if (leftSum == rightSum){
				result = i;
				break;
			} else {
				result = -1;
			}
		}
		return result;
	}
	
	
}

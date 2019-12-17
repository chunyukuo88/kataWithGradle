package kataWithGradle;

public class ChocolateBar {

	public int singleSquare(int i, int j) {
		if (i==1 && j==1) {
			return 0;
		} else
		return 1;
	}

	public int twoSquares(int i, int j) {
		if ((i*j)==2) {
			return 1;
		} else {
		return 0;
		}
	}

	public int squareNumbers(int i, int j) {
		return (i*j)-1;
	}

	public int breakChocolate(int n, int m) {
		if (n*m == 0) {
			return 0;
		} else if (n*m ==1) {
			return 0;
		} else {
			return (n*m)-1;
		}
	}

	public int[] produceDoubledInts(int[] input) {
		int L = input.length;
		int[] result = new int[L];
		for (int i = 0; i < L; i++) {
			result[i] = (input[i]*2);
			System.out.print(result[i]);
		}
		return result;
	}

	
}

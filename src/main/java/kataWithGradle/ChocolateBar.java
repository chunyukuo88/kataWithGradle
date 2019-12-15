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

	
}

package kataWithGradle;

public class TrailingZeroes {
	
	public int countZeroes(int i) {
		int factorial = produceFactorial(i);
		String factorialAsString = Integer.toString(factorial);
		String[] factorialAsArray = factorialAsString.split("");
		int allZeroes = 0;
		for (int j = factorialAsArray.length - 1; j > 0; j--) {
			if (factorialAsArray[j].equals("0")) {
				allZeroes++;
			}
		}
		System.out.println(allZeroes);
		return allZeroes;
	}
	
	public boolean detectTrailingZero(int i) {
		
		int factorial = produceFactorial(i);
		String factorialAsString = Integer.toString(factorial);
		String[] factorialAsArray = factorialAsString.split("");
		int itsLength = factorialAsArray.length; 
		if (factorialAsArray[itsLength - 1].equals("0")) {
			return true;
		} else {
			return false;
		}
		

	}

	public int produceFactorial(int i) {
		int j = i;
		int factorial = 1;
		while (j > 0) {
			factorial *= j;
			j--;
		}
		return factorial;
	}


	public int zeros(int n) {
		if (n == 0) {
			return 0;
		} else {
			int factorial = produceFactorial(n);
			String[] factorialAsArray = Integer.toString(factorial).split("");
			int trailingZeroes = 0;
			
			boolean hasTrailingZeroes = true;
			while (hasTrailingZeroes) {
				for (int j = factorialAsArray.length - 1; j > 0; j--) {
					if (factorialAsArray[j].equals("0")) {
						trailingZeroes++;
					} else {
						hasTrailingZeroes = false;
					}
				}
			}
			return trailingZeroes;
		}
	}

}

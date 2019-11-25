package kataWithGradle;

public class Supermarket {

	public void addElements(int[] testArray, int numberOfTills) {
		
		int[] tillArray = new int[numberOfTills];
		
		for (int i = 0; i < tillArray.length; i++) {
			tillArray[i] += testArray[i];
		}
	}
}

/*
 * for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[0];  
 * */


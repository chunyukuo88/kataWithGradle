package kataWithGradle;

import java.util.ArrayList;
import java.util.List;

public class zzz {

    public static int[] oddNumbers(int l, int r) {
        ArrayList<Integer> oddNums = new ArrayList<>();

        for (int i = l; i < (r+1); i++){
            if (i%2 != 0)
                oddNums.add(i);
        }

        int[] result = new int[oddNums.size()];
        result = oddNums.toArray();

        for (int i = 0 ; i < result.length ; i++){
            result[i] = oddNums.get(i);
        }


        return result;
    }
    
	public static void main(String[] args) {
		
	}
}

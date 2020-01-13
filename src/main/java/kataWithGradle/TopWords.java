package kataWithGradle;

import java.util.HashMap;

public class TopWords {

	public HashMap<String, Integer> produceTallies(String input) {
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		String[] inputAsArray = input.toLowerCase().split(" ");
		for (int i = 0; i < inputAsArray.length; i++) {
			if (result.containsKey(inputAsArray[i]) == true) {
				int updatedValue = result.get(inputAsArray[i]);
				result.put(inputAsArray[i], (updatedValue + 1));
			} else
				result.put(inputAsArray[i], 1);
		}
		 result.entrySet().forEach(entry->{
			    System.out.println(entry.getKey() + " " + entry.getValue());  
			 });
		return result;
	}

}

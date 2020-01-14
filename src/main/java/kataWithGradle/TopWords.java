package kataWithGradle;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
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

		return result;
	}

	public ArrayList<String> top3(String input) {
		if (input == "") {
			ArrayList<String> result = new ArrayList<String>();
			return result;
		} else {
			
			HashMap<String, Integer> tallies = new HashMap<String, Integer>();
			String[] inputAsArray = input.toLowerCase().split(" ");
			for (int i = 0; i < inputAsArray.length; i++) {
				inputAsArray[i] = inputAsArray[i].replace(",", "");
				inputAsArray[i] = inputAsArray[i].replace(".", "");
			}
			
			for (int i = 0; i < inputAsArray.length; i++) {
				if (tallies.containsKey(inputAsArray[i]) == true) {
					int updatedValue = tallies.get(inputAsArray[i]);
					tallies.put(inputAsArray[i], (updatedValue + 1));
				} else
					tallies.put(inputAsArray[i], 1);
			}
			
			//An empty list
			ArrayList<Integer> top3tallies = new ArrayList<>();

			tallies.entrySet().forEach(entry->{
			    top3tallies.add(entry.getValue());  
			 });
			//Now top3tallies contains ALL tallies, not just the top 3
			
			Collections.sort(top3tallies, Collections.reverseOrder());
			//Now the tallies are sorted, greatest to least. 
			
			//Reduce top3tallies to just the top three tallies. 
			for (int i = 3; i < top3tallies.size(); i++) {
				top3tallies.remove(i);
			}

			//Two lines below this, we will populate the result by conditionally 
			//iterating through the hashmap.
			ArrayList<String> result = new ArrayList<>();
			
			int index = 0;
			if (top3tallies.size() > 2)
				index = 3;
			else if (top3tallies.size() == 2)
				index = 2;
			else if ((top3tallies.size() == 1))
				index = 1;
			else
				index = 0;
			
			for (int i = 0; i < index; i++) {
				for (String key : tallies.keySet()) {
					if (tallies.get(key) == top3tallies.get(i) && result.contains(key) == false) {
						result.add(key);
						System.out.println(key);
					}
				}		
			}
			
			
			return result;
			
		}
	}

}

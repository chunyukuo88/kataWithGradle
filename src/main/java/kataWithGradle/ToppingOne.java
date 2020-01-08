package kataWithGradle;

import java.util.Arrays;
import java.util.HashMap;

public class ToppingOne {

	public String topping1(HashMap<String, String> input, String targetKey) {
		if (targetKey == "bread")
			input.put("bread", "butter");
		else
			input.put("ice cream", "cherry");
		
		return input.get(targetKey);
	}

	public HashMap<String, String> topping1(HashMap<String, String> map) {
		System.out.println(map);
		
		if (map.containsKey("bread"))
			map.replace("bread", "butter");
		else if (map.containsKey("bread") == false)
			map.put("bread", "butter");
		
		if (map.containsKey("ice cream"))
			map.replace("ice cream", "cherry");
		else if (map.containsKey("ice cream") == false)
			map.put("ice cream", "cherry");
		
		System.out.println(map);

		return map;
	}

	
}

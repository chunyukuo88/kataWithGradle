package kataWithGradle;
//From codingbat:   https://codingbat.com/prob/p197888

import java.util.Map;

public class MapBully {

	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			if (map.get("a").equals("") != true) {
				String purloinedValue = map.get("a");
				map.put("b", purloinedValue);
				map.put("a", "");
			}
			return map;
		} else {
			return map;
		}
	}

	
}

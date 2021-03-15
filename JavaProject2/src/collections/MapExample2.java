package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("È«±æµ¿", 10);
		map.put("±è¹Î¼ö", 20);
		map.remove("È«±æµ¿");
		//
		Integer result = map.get("È«±æµ¿");
		System.out.println("key: È«±æµ¿" + ", val: " + result);
		if (map.containsKey("È«±æµ¿")) {
			System.out.println("key: È«±æµ¿" + ", val: " + result);
		}
		// Set<String>
		Set<String> set = map.keySet(); // key°ª¸¸ °¡Á®¿È
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + val);
		}
		// Entry<String, Integer>
		Set<Entry<String, Integer>> entSet = map.entrySet(); // key, value °¡Á®¿È
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while(entIter.hasNext()) {
			Entry<String, Integer> ent = entIter.next();
			String key = ent.getKey();
			Integer val = ent.getValue();
			System.out.println("key: " + key + ", val: " + val);
		}
	}
}

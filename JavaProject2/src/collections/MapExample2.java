package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ȫ�浿", 10);
		map.put("��μ�", 20);
		map.remove("ȫ�浿");
		//
		Integer result = map.get("ȫ�浿");
		System.out.println("key: ȫ�浿" + ", val: " + result);
		if (map.containsKey("ȫ�浿")) {
			System.out.println("key: ȫ�浿" + ", val: " + result);
		}
		// Set<String>
		Set<String> set = map.keySet(); // key���� ������
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + val);
		}
		// Entry<String, Integer>
		Set<Entry<String, Integer>> entSet = map.entrySet(); // key, value ������
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while(entIter.hasNext()) {
			Entry<String, Integer> ent = entIter.next();
			String key = ent.getKey();
			Integer val = ent.getValue();
			System.out.println("key: " + key + ", val: " + val);
		}
	}
}

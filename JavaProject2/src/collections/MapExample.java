package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 15);
		map.put("김민수", 20);
		map.put("박소연", 23);
		map.put("홍길동", 25);	// set은 동일한 값 허용 X로 map도 마찬가지. 25로 업데이트 되어 반영

		Integer result = map.get("홍길동"); // key값에 해당하는 value값을 반환
		Set<String> set = map.keySet(); // key에 해당하는 부분을 set 컬렉션에 담는다
		for (String key : set) { // 반복자 사용 안 하는 방법
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + val);
		}
//		Iterator<String> iter = set.iterator();	// 하나씩 꺼내기 위한 반복자
//		while(iter.hasNext()){
//			String key = iter.next();
//			Integer val = map.get(key);
//			System.out.println("key: "+key+", val: "+val);
//		}

		Map<Integer, String> sMap = new HashMap<>();
		String sResult = sMap.get(10); // String 타입으로 반환
	}

}

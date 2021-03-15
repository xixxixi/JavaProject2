package collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

//class Integer implements Serializable, Comparable<Integer> {
//
//	@Override
//	public int compareTo(Integer o) {
//		return 0; // -1 this < o, o this == o, +1 this > o
//	}
//}

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(85));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		Iterator<Integer> iter = scores.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("-----------------------------");
		iter = scores.descendingIterator();	// 역순으로 가져오는 것
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("-----------------------------");
		NavigableSet<Integer> nset = scores.descendingSet();	// 크다 작다 기준을 갖고 있는 set 컬렉션. 역순으로 가져옴
		for(Integer i : nset) {
			System.out.println(i);
		}

//		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
//		scores.put(new Integer(87), "홍길동");
//		scores.put(new Integer(98), "이동수");
//		scores.put(new Integer(75), "박길순");
//		scores.put(new Integer(95), "신용권");
//		scores.put(new Integer(80), "김자바");
//
//		Map.Entry<Integer, String> entry = null;
//
//		entry = scores.firstEntry();
//		System.out.println("가장 낮은 점수:" + entry.getKey() + "-" + entry.getValue());
//
//		entry = scores.lastEntry();
//		System.out.println("가장 높은 점수:" + entry.getKey() + "-" + entry.getValue() + "\n");
//
//		entry = scores.lowerEntry(new Integer(95));
//		System.out.println("95점 아래 점수:" + entry.getKey() + "-" + entry.getValue());
//
//		entry = scores.higherEntry(new Integer(95));
//		System.out.println("95점 위의 점수:" + entry.getKey() + "-" + entry.getValue() + "\n");
//
//		entry = scores.floorEntry(new Integer(95));
//		System.out.println("95점 이거나 바로 아래 점수:" + entry.getKey() + "-" + entry.getValue());
//
//		entry = scores.ceilingEntry(new Integer(85));
//		System.out.println("85점 이거나 바로 위의 점수:" + entry.getKey() + "-" + entry.getValue() + "\n");
//
//		while (!scores.isEmpty()) {
//			entry = scores.pollFirstEntry();
//			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
//		}
//
	}
}

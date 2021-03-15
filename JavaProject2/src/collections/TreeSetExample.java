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
		iter = scores.descendingIterator();	// �������� �������� ��
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("-----------------------------");
		NavigableSet<Integer> nset = scores.descendingSet();	// ũ�� �۴� ������ ���� �ִ� set �÷���. �������� ������
		for(Integer i : nset) {
			System.out.println(i);
		}

//		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
//		scores.put(new Integer(87), "ȫ�浿");
//		scores.put(new Integer(98), "�̵���");
//		scores.put(new Integer(75), "�ڱ��");
//		scores.put(new Integer(95), "�ſ��");
//		scores.put(new Integer(80), "���ڹ�");
//
//		Map.Entry<Integer, String> entry = null;
//
//		entry = scores.firstEntry();
//		System.out.println("���� ���� ����:" + entry.getKey() + "-" + entry.getValue());
//
//		entry = scores.lastEntry();
//		System.out.println("���� ���� ����:" + entry.getKey() + "-" + entry.getValue() + "\n");
//
//		entry = scores.lowerEntry(new Integer(95));
//		System.out.println("95�� �Ʒ� ����:" + entry.getKey() + "-" + entry.getValue());
//
//		entry = scores.higherEntry(new Integer(95));
//		System.out.println("95�� ���� ����:" + entry.getKey() + "-" + entry.getValue() + "\n");
//
//		entry = scores.floorEntry(new Integer(95));
//		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����:" + entry.getKey() + "-" + entry.getValue());
//
//		entry = scores.ceilingEntry(new Integer(85));
//		System.out.println("85�� �̰ų� �ٷ� ���� ����:" + entry.getKey() + "-" + entry.getValue() + "\n");
//
//		while (!scores.isEmpty()) {
//			entry = scores.pollFirstEntry();
//			System.out.println(entry.getKey() + "-" + entry.getValue() + "(���� ��ü ��: " + scores.size() + ")");
//		}
//
	}
}

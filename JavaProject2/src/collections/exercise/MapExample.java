package collections.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			int score = map.get(key);
			totalScore += score;
			if (maxScore < score) {
				maxScore = map.get(key);
				name = key;
			}
		}
		System.out.println("�������: " + totalScore / map.size());
		System.out.println("�ְ�����: " + maxScore);
		System.out.println("�ְ������� ���� ���̵�: " + name);
		
		String str;
		System.out.println("b".compareTo("c"));
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("a");
		tSet.add("b");
		tSet.add("c");
		tSet.first();
		tSet.last();

		
//		Set<Entry<String, Integer>> entSet = map.entrySet();
//		for (Map.Entry<String, Integer> entry : entSet) {
//			if (entry.getValue() > maxScore) {
//				name = entry.getKey();
//				maxScore = entry.getValue();
//			}
//			totalScore += entry.getValue();
//		}
//		int avgScore = totalScore / map.size();
//		System.out.println("��� ���� : " + avgScore);
//		System.out.println("�ְ� ���� : " + maxScore);
//		System.out.println("�ְ������� ���� ���̵� : " + name);

	}
}

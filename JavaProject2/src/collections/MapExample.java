package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("ȫ�浿", 15);
		map.put("��μ�", 20);
		map.put("�ڼҿ�", 23);
		map.put("ȫ�浿", 25);	// set�� ������ �� ��� X�� map�� ��������. 25�� ������Ʈ �Ǿ� �ݿ�

		Integer result = map.get("ȫ�浿"); // key���� �ش��ϴ� value���� ��ȯ
		Set<String> set = map.keySet(); // key�� �ش��ϴ� �κ��� set �÷��ǿ� ��´�
		for (String key : set) { // �ݺ��� ��� �� �ϴ� ���
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + val);
		}
//		Iterator<String> iter = set.iterator();	// �ϳ��� ������ ���� �ݺ���
//		while(iter.hasNext()){
//			String key = iter.next();
//			Integer val = map.get(key);
//			System.out.println("key: "+key+", val: "+val);
//		}

		Map<Integer, String> sMap = new HashMap<>();
		String sResult = sMap.get(10); // String Ÿ������ ��ȯ
	}

}

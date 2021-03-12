package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListeExample {
	public static void main(String[] args) {
		String[] strAry = new String[10];
		strAry[0] = "Hello";
		strAry[1] = "World";
		strAry[4] = "Nice";
		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i] != null) {
				System.out.println(strAry[i]);
			}
		}
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(20);
		numList.remove(10);

		List<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("Nice");
		strList.add("Good");
		strList.add(0, "Very");

		strList.get(0);
		strList.remove(2);

		System.out.println(strList.size());
		strList.remove(2);
		System.out.println(strList.size());
//		for (int i = 0; i < 50; i++) {
//			strList.add(String.valueOf(i));
//		}
//		strList.add(100);
		for (Object obj : strList) {
			String str = (String) obj;
			System.out.println(str);

		}

	}

}

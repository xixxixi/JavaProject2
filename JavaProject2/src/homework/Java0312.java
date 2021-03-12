package homework;

import java.util.ArrayList;
import java.util.List;

public class Java0312 {

	public static void main(String[] args) {

		int[] intAry = { 3, 8, 4 };
		for (int i = 0; i < intAry.length-1; i++) {
			for (int j = i + 1; j < intAry.length; j++) {
				if (intAry[i] > intAry[j]) {
					int temp = intAry[i];
					intAry[i] = intAry[j];
					intAry[j] = temp;
				}
			}
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}

		List<Integer> aList = new ArrayList<>();
		aList.add(3);
		aList.add(4);
		aList.add(8);
		int temp = 0;
		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(0) > aList.get(1)) {
				temp = aList.get(0);
				aList.set(0, aList.get(1));
				aList.set(1, temp);
			}
		}
		for (Integer i : aList) {
			System.out.println(i);
		}
	}
}
package controls;

public class ForExample {

	public static void main(String[] args) {
		// 1 ~ 10 �հ�
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // ¦���� �հ�..
				sum = sum + i;
			}
//			System.out.println("i : " + i);
//			System.out.println("sum:" + sum);
		}
		System.out.println("1 ~ 10 ¦���� ��: " + sum);
	}

}

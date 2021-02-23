package controls;

public class ForExample {

	public static void main(String[] args) {
		// 1 ~ 10 합계
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // 짝수만 합계..
				sum = sum + i;
			}
//			System.out.println("i : " + i);
//			System.out.println("sum:" + sum);
		}
		System.out.println("1 ~ 10 짝수의 합: " + sum);
	}

}

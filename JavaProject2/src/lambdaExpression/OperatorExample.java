package lambdaExpression;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score); // 두 개의 int 연산
		}

		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("최대값: " + max);

		int max1 = maxOrMin((left, right) -> left > right ? left : right); // 3항 연산잔
		System.out.println("큰값은: " + max1);

		// 최소값 얻기
		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("최소값: " + min);
		
		int min1 = maxOrMin((left, right) -> left < right ? left : right); // 3항 연산잔
		System.out.println("작은값은: " + min1);
	}
}

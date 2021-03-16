package lambdaExpression;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score); // �� ���� int ����
		}

		return result;
	}

	public static void main(String[] args) {
		// �ִ밪 ���
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("�ִ밪: " + max);

		int max1 = maxOrMin((left, right) -> left > right ? left : right); // 3�� ������
		System.out.println("ū����: " + max1);

		// �ּҰ� ���
		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("�ּҰ�: " + min);
		
		int min1 = maxOrMin((left, right) -> left < right ? left : right); // 3�� ������
		System.out.println("��������: " + min1);
	}
}

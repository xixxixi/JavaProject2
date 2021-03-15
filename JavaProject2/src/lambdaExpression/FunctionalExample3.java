package lambdaExpression;

@FunctionalInterface
interface MyFuncnterface {
	int run(int a, int b); // �Ű����� 2�� �޾� intŸ���� �����ϴ� run�߻� �޼ҵ�
}

public class FunctionalExample3 {
	public static void main(String[] args) {
		MyFuncnterface mfi = (a, b) -> a + b;

		int result = mfi.run(10, 20);
		System.out.println("��������: " + result);

		mfi = (num1, num2) -> num1 * num2;
		result = mfi.run(10, 20);
		System.out.println("��������: " + result);

		mfi = (aa, bb) -> { // return�� �߰�ȣ ���� ����
			return (aa * bb) / 2;
		};
		result = mfi.run(10, 20);
		System.out.println("��������: " + result);
	}

}

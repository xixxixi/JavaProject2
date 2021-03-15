package lambdaExpression;

interface MyFunctionalInterface {	// �Լ��� �������̽�(FunctionalInterface) : �����ؾ� �� �޼ҵ尡 �ϳ��� �ִ� ��
	void run(); // �߻� �޼ҵ�
}

class MyFunctionClass implements MyFunctionalInterface {
	@Override
	public void run() {
		System.out.println("run�� �����մϴ�.");
	}
}

public class FunctionalExample {
	public static void main(String[] args) {
		MyFunctionalInterface mif = new MyFunctionalInterface() {// �͸� ���� ��ü. Ÿ�� Ÿ��
			@Override
			public void run() {// �������̽��� ���� �ִ� �޼ҵ带 �����ϴ� ����
				System.out.println("run()�� �����մϴ�.");
			}
		};
		mif.run(); // ������ ����� ����

		mif = () -> System.out.println("run() �޼ҵ带 �����մϴ�."); 	// �Ű���, ���� �κ��� ȭ��ǥ�� ����. �����ϴ� �κ��� �� ���̸� �߰�ȣ ���� ����. 
																	// ���� ǥ������ ���� �޼ҵ尡 �ϳ��� ���� ��� ����
		mif.run();
	}
}

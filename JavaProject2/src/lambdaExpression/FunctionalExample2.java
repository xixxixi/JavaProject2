package lambdaExpression;

@FunctionalInterface // ������ �� �ִ� �޼ҵ尡 1��. 2�� �̻��̸� ���� ����
interface MyFunctionInterface {
	void run(String str); // �Ű����� �ִ� �޼ҵ�
}

public class FunctionalExample2 {
	public static void main(String[] args) {
		MyFunctionInterface mfi = (str) -> // �Ű� ����str�� ����� �� ��
		System.out.println(str + "�� �����մϴ�.");

		mfi.run("run()");
		mfi.run("call()");
	}
}
package operators;

public class MethodExample {

	public static void main(String[] args) {
		int result = divide(30, 12);
		System.out.println("��� : " + result);
		// result = 30, 20�� ���̸� ����ϴ� minus()
		// result = 15, 13�� ���� ����ϴ� multi()
		// result = 30, 12�� ���� ���� ����ϴ� divide()
	}

	public static void printAge(int age) { // void ������ ���ϰ��� ������ ����
		System.out.println("���̴� : " + age + "�Դϴ�.");
	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}
}

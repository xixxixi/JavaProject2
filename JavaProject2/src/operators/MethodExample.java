package operators;

public class MethodExample {

	public static void main(String[] args) {
		int result = divide(30, 12);
		System.out.println("결과 : " + result);
		// result = 30, 20의 차이를 계산하는 minus()
		// result = 15, 13의 곱을 계산하는 multi()
		// result = 30, 12의 나눈 몫을 계산하는 divide()
	}

	public static void printAge(int age) { // void 구문은 리턴값을 가지지 않음
		System.out.println("나이는 : " + age + "입니다.");
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

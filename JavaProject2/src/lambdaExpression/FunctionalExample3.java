package lambdaExpression;

@FunctionalInterface
interface MyFuncnterface {
	int run(int a, int b); // 매개값을 2개 받아 int타입을 리턴하는 run추상 메소드
}

public class FunctionalExample3 {
	public static void main(String[] args) {
		MyFuncnterface mfi = (a, b) -> a + b;

		int result = mfi.run(10, 20);
		System.out.println("실행결과는: " + result);

		mfi = (num1, num2) -> num1 * num2;
		result = mfi.run(10, 20);
		System.out.println("실행결과는: " + result);

		mfi = (aa, bb) -> { // return과 중괄호 생략 가능
			return (aa * bb) / 2;
		};
		result = mfi.run(10, 20);
		System.out.println("실행결과는: " + result);
	}

}

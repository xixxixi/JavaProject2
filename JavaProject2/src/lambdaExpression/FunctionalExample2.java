package lambdaExpression;

@FunctionalInterface // 구현할 수 있는 메소드가 1개. 2개 이상이면 오류 생성
interface MyFunctionInterface {
	void run(String str); // 매개값이 있는 메소드
}

public class FunctionalExample2 {
	public static void main(String[] args) {
		MyFunctionInterface mfi = (str) -> // 매개 변수str는 지우면 안 됨
		System.out.println(str + "을 실행합니다.");

		mfi.run("run()");
		mfi.run("call()");
	}
}
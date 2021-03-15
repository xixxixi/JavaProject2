package lambdaExpression;

interface MyFunctionalInterface {	// 함수적 인터페이스(FunctionalInterface) : 구현해야 할 메소드가 하나만 있는 것
	void run(); // 추상 메소드
}

class MyFunctionClass implements MyFunctionalInterface {
	@Override
	public void run() {
		System.out.println("run을 실행합니다.");
	}
}

public class FunctionalExample {
	public static void main(String[] args) {
		MyFunctionalInterface mif = new MyFunctionalInterface() {// 익명 구현 객체. 타겟 타입
			@Override
			public void run() {// 인터페이스가 갖고 있는 메소드를 정의하는 내용
				System.out.println("run()를 실행합니다.");
			}
		};
		mif.run(); // 구현된 기능을 실행

		mif = () -> System.out.println("run() 메소드를 실행합니다."); 	// 매개값, 구현 부분을 화살표로 연결. 선언하는 부분이 한 줄이면 중괄호 생략 가능. 
																	// 람다 표현식은 구현 메소드가 하나일 때만 사용 가능
		mif.run();
	}
}

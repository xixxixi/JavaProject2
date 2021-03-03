package objects2;

import objects.Student;

public class MethodExample {
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println("매개값[" + i + "]: " + args[i]);

		}

		Calculator.getRect(4.5, 2); // static

		Calculator cal = new Calculator(); // 생성자를 호출 - 힙 영역에 객체가 추가
		double result = cal.getArea(3.5); // 반지름이 3.5인 원의 반지름을 구해줌

//		MethodExample me = new MethodExample(); static 키워드가 없을 때
//		me.sum(10, 20);
		sum(10, 20);

		Book b1 = new Book("", "", "", 100);
		Student s1 = new Student();
		s1.run();
		s1.study();

	}

	public static int sum(int a, int b) {
		return a + b;
	}

}

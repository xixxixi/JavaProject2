package objects2;

public class Calculator {
	double pi = 3.14;

	public double getArea(double radius) { // new 인스턴스를 선언해줘야 함
		double result = pi * radius * radius;
		return result;

	}

	public static double getRect(double d1, double d2) {
		// static = 자바 가상머신이 클래스를 읽으며 메모리에 getRect를 실행할 준비가 됨
		double result = d1 * d2;
		return result;
	}

}
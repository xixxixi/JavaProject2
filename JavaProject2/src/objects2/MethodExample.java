package objects2;

import objects.Student;

public class MethodExample {
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println("�Ű���[" + i + "]: " + args[i]);

		}

		Calculator.getRect(4.5, 2); // static

		Calculator cal = new Calculator(); // �����ڸ� ȣ�� - �� ������ ��ü�� �߰�
		double result = cal.getArea(3.5); // �������� 3.5�� ���� �������� ������

//		MethodExample me = new MethodExample(); static Ű���尡 ���� ��
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

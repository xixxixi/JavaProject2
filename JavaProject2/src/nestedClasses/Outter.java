package nestedClasses;

public class Outter {
	String field = "Outter-field";

	void method() {
		System.out.println("Outter-method");
	}

	class Nested {
		String field = "Nested-field";

		void method() {
			System.out.println("Nested-method");
		}

		void print() {
			System.out.println(this.field);		// ��ø ��ü ����
			this.method();
			System.out.println(Outter.this.field);	// �ٱ� ��ü ����. �ٱ�Ŭ����.this.�ʵ�or�޼ҵ�();
			Outter.this.method();
		}

	}

}

package objects;

public class Student {
	// �Ӽ�(�ʵ�)
	String studentNo; // p21010101
	int grade;
	int math;
	int eng;

	// ������ : �ʵ尪�� �ʱ�ȭ�� �� ���
	public Student() {
		System.out.println("�����ڸ� ȣ���մϴ�.");

	}

	Student(String studentNo) { // studentNo���� �ʱ�ȭ �ϴµ� ���
		this.studentNo = studentNo; // Ŭ������ ���� �ִ� ��ü�� ���� ������� �ν��Ͻ�
	}

	Student(int grade, int eng, int math) { // int Ÿ�� �� 3���� �ʱ�ȭ �ϴµ� ���
		this.grade = grade;
		this.eng = eng;
		this.math = math;
	}

	// ���(�޼ҵ�)
	public void study() {
		System.out.println("�����մϴ�.");
	}

	public void run() {
		System.out.println("��� �մϴ�.");

	}

	public void introduce() {
		System.out.println("�й�: " + studentNo + ", �г�: " + grade + ", ����: " + eng + ", ����: " + math);
	}
}

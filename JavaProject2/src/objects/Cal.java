package objects;

public class Cal {

	public static void main(String[] args) {
//		showInfo("ȫ�浿");	// ���ڿ� Ÿ��

		Student2 std = new Student2(); // Student2 Ÿ��
		std.setName("�ֱ浿");
		std.setEng(90);
		std.setMath(95);
//		showInfo(std);

		Student2[] stds = new Student2[3]; // �迭�� �Ű���
		stds[0] = new Student2("�Ӽ���", 77, 88);
		stds[1] = new Student2("���ؿ�", 79, 89);
		stds[2] = new Student2("���ն�", 82, 86);
		showInfo(stds);

	}

	public static void showInfo(Student2[] students) { // �迭�� �Ű������� ����
		for (Student2 std : students) {
			if (std != null) // null�� �ƴ� ���� ȣ��
				showInfo(std);
		}
	}

	public static void showInfo(Student2 student) { // Student2 Ŭ������ �޾Ƽ� �����ϴ� �޼ҵ�
		System.out.println(student.getName() + ", �ȳ��ϼ���.");
		System.out.println("���������� " + student.getEng() + ", ���������� " + student.getMath() + ", �����հ�� "
				+ (student.getEng() + student.getMath()));
	}

	public static void showInfo(String name) { // ���ڿ��� �޾Ƽ� �����ϴ� �޼ҵ�
		System.out.println(name + ", �ȳ��ϼ���.");
	}

}

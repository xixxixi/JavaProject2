package controls;

public class IfElseExample {

	public static void main(String[] args) {
		String grade = "F";
		int score = 90;

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade = "A+";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade = "B+";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade = "C+";
			}
		} else {
			grade = "F";
		}
		
		switch (score / 10) {
		case 10:
			grade = "A+"; break;
		case 9:
			grade = "A"; break;
		default:
			grade = "F";
		}

		System.out.println("���� " + score + "�� " + grade + " �Դϴ�.");

		// if ������ 90�� �̻� A - 95�� �̻� A+
		// else if 80�� �̻� b - 85 �̻� B+
		// else if 70�� �̻� c - 75 �̻� C+
		// else �� �ܴ� f

		// ���� 85�� B �Դϴ�.
	}

}

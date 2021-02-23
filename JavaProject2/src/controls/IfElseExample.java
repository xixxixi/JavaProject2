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

		System.out.println("점수 " + score + "는 " + grade + " 입니다.");

		// if 구문과 90점 이상 A - 95점 이상 A+
		// else if 80점 이상 b - 85 이상 B+
		// else if 70점 이상 c - 75 이상 C+
		// else 그 외는 f

		// 점수 85는 B 입니다.
	}

}

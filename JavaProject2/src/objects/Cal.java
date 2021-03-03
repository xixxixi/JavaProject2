package objects;

public class Cal {

	public static void main(String[] args) {
//		showInfo("홍길동");	// 문자열 타입

		Student2 std = new Student2(); // Student2 타입
		std.setName("최길동");
		std.setEng(90);
		std.setMath(95);
//		showInfo(std);

		Student2[] stds = new Student2[3]; // 배열을 매개값
		stds[0] = new Student2("임성원", 77, 88);
		stds[1] = new Student2("정준영", 79, 89);
		stds[2] = new Student2("도왕락", 82, 86);
		showInfo(stds);

	}

	public static void showInfo(Student2[] students) { // 배열을 매개값으로 받음
		for (Student2 std : students) {
			if (std != null) // null이 아닌 값만 호출
				showInfo(std);
		}
	}

	public static void showInfo(Student2 student) { // Student2 클래스를 받아서 실행하는 메소드
		System.out.println(student.getName() + ", 안녕하세요.");
		System.out.println("영어점수는 " + student.getEng() + ", 수학점수는 " + student.getMath() + ", 점수합계는 "
				+ (student.getEng() + student.getMath()));
	}

	public static void showInfo(String name) { // 문자열을 받아서 실행하는 메소드
		System.out.println(name + ", 안녕하세요.");
	}

}

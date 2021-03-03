package objects;

public class Student {
	// 속성(필드)
	String studentNo; // p21010101
	int grade;
	int math;
	int eng;

	// 생성자 : 필드값을 초기화할 때 사용
	public Student() {
		System.out.println("생성자를 호출합니다.");

	}

	Student(String studentNo) { // studentNo값을 초기화 하는데 사용
		this.studentNo = studentNo; // 클래스가 갖고 있는 객체를 따라서 만들어진 인스턴스
	}

	Student(int grade, int eng, int math) { // int 타입 값 3개를 초기화 하는데 사용
		this.grade = grade;
		this.eng = eng;
		this.math = math;
	}

	// 기능(메소드)
	public void study() {
		System.out.println("공부합니다.");
	}

	public void run() {
		System.out.println("운동을 합니다.");

	}

	public void introduce() {
		System.out.println("학번: " + studentNo + ", 학년: " + grade + ", 영어: " + eng + ", 수학: " + math);
	}
}

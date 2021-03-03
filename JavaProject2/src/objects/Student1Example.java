package objects;

class Student1 {
	private String name;
	private int eng;
	private int math;

	Student1() {
	}

	Student1(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	void showInfo() {
		System.out.println("이름은 - " + name + " 영어 - " + eng + " 수학 - " + " 합계 - " + (eng + math));
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEng(int eng) {
		if (eng < 0) {
			this.eng = 0;
		} else {
			this.eng = eng;
		}
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return this.eng;
	}

	public int getMath() {
		return this.math;
	}

	public String getName() {
		return this.name;
	}
}

public class Student1Example {
	public static void main(String[] args) {
		Student1 s1 = new Student1("홍길동", 90, 85);
		Student1 s2 = new Student1("김길동", 80, 75);
		Student1 s3 = new Student1("이길동", 70, 95);
		Student1 s4 = new Student1();
//		s4.name="최길동";
		s4.setName("최길동");
//		s4.eng=70;
		s4.setEng(-70);
//		s4.math = 80;
		s4.setMath(80);
		System.out.println(s4.getMath());

		Student1[] students = new Student1[4];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;

//		Student1[] students = new Student1[1];
//		student1[0] = new Student1("홍길동", 90, 85);
//		student1[1] = new Student1("김길동", 80, 75);

		for (Student1 student : students) {
			student.showInfo();
		}

	}
}

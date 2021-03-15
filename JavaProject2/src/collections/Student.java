package collections;

public class Student {
	private int sno;
	private String name;
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.sno + this.name.hashCode(); // 학번이랑 이름이 같으면 
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		Student s = (Student) obj; 
		return this.sno == s.sno && this.name.equals(s.name);	// 학생번호랑 이름이 같으면 논리적으로 같은 객채라고 정의
		}
		return false;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

}

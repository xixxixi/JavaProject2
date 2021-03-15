package collections.exercise;

public class Student {
	public int studentNum;
	public String name;

	public Student(int StudentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (studentNum == s.studentNum) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
}

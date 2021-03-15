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
		return this.sno + this.name.hashCode(); // �й��̶� �̸��� ������ 
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		Student s = (Student) obj; 
		return this.sno == s.sno && this.name.equals(s.name);	// �л���ȣ�� �̸��� ������ �������� ���� ��ä��� ����
		}
		return false;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

}

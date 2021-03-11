package generics;
class Person {
	String name;	// �ʵ�
	Person(String name){	// ������
		this.name=name;
	}
	String getName() {	// �޼ҵ�
		return this.name;
	}
	@Override
	public String toString() {
		return name;
	}
}
// Person�� ��ӹ޴� Worker Ŭ����
class Worker extends Person {	// Person�� �⺻ �����ڰ� ���� ������ �θ��� �����ڸ� ȣ���� ��� ��
	Worker(String name){
		super(name);
	}
}
// Person�� ��ӹ޴� Student
class Student extends Person{
	Student(String name){
		super(name);
	}
}
// Student�� ��ӹ޴� HighStudent
class HighStudent extends Student{
	HighStudent(String name){
		super(name);
	}
}
// ��������
public class Course<T> {
	String courseName;
	T[]	students;
	Course(String courseName, int capacity){	// capacity : ������ ������ �� �ִ� ���� �ο�. main���� ����
		this.courseName = courseName;
		students = (T[]) new Object[capacity];	// �迭�� ũ�⸸ŭ �����ϰڴٴ� �ǹ�. �迭 �տ� Object���� �� (T[]) �߰�
	}
	public void add(T t) {
		for (int i = 0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;	// ��� �ִ� ������ �� ĭ �ְ� ��������
				break;
			}
		}
	}
	public String getCourseName() {
		return this.courseName;
	}
	public T[] getStudents() {	// ��ϵǾ� �ִ� �л����� ���� �� ��
		return this.students;
	}

}

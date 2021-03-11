package generics;
class Person {
	String name;	// 필드
	Person(String name){	// 생성자
		this.name=name;
	}
	String getName() {	// 메소드
		return this.name;
	}
	@Override
	public String toString() {
		return name;
	}
}
// Person을 상속받는 Worker 클래스
class Worker extends Person {	// Person에 기본 생성자가 없기 때문에 부모의 생성자를 호출해 줘야 함
	Worker(String name){
		super(name);
	}
}
// Person을 상속받는 Student
class Student extends Person{
	Student(String name){
		super(name);
	}
}
// Student을 상속받는 HighStudent
class HighStudent extends Student{
	HighStudent(String name){
		super(name);
	}
}
// 수업과정
public class Course<T> {
	String courseName;
	T[]	students;
	Course(String courseName, int capacity){	// capacity : 과정에 참여할 수 있는 제한 인원. main에서 선언
		this.courseName = courseName;
		students = (T[]) new Object[capacity];	// 배열을 크기만큼 선언하겠다는 의미. 배열 앞에 Object선언 후 (T[]) 추가
	}
	public void add(T t) {
		for (int i = 0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;	// 비어 있는 공간에 한 칸 넣고 빠져나옴
				break;
			}
		}
	}
	public String getCourseName() {
		return this.courseName;
	}
	public T[] getStudents() {	// 등록되어 있는 학생들을 리턴 해 줌
		return this.students;
	}

}

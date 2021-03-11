package generics;

import java.util.Arrays;

public class WildCardExample {
	
	public static void registerCourse(Course<?> course) {	// course�� ��� Ÿ���� ���� �� �ִ� ���׸� Ÿ��
		System.out.println(course.getCourseName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {	// worker�� ���� ��Ҹ�. student, highstudent�� ����
		System.out.println(course.getCourseName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {	// student�� ���� ��Ҹ� worker, person�� ����
		System.out.println(course.getCourseName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л�����", 5);
		highStudentCourse.add(new HighStudent("����л�"));
		
		registerCourse(personCourse);	// ��� ���� ��� ����
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		// registerCourseStudent(studentCourse);	(X)
		// registerCourseStudent(workerCourse);		(X)
		registerCourseStudent(studentCourse);	// �л� ������ ��� ����
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);		// �����ΰ� �Ϲ��� ������ ��� ����
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);		(X)
//		registerCourseWorker(highStudentCourse);	(X)
	}
}

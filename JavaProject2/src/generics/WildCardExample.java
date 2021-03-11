package generics;

import java.util.Arrays;

public class WildCardExample {
	
	public static void registerCourse(Course<?> course) {	// course의 모든 타입을 받을 수 있는 제네릭 타입
		System.out.println(course.getCourseName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {	// worker의 상위 요소만. student, highstudent만 가능
		System.out.println(course.getCourseName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {	// student의 하위 요소만 worker, person만 가능
		System.out.println(course.getCourseName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);	// 모든 과정 등록 가능
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		// registerCourseStudent(studentCourse);	(X)
		// registerCourseStudent(workerCourse);		(X)
		registerCourseStudent(studentCourse);	// 학생 과정만 등록 가능
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);		// 직장인과 일반인 과정만 등록 가능
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);		(X)
//		registerCourseWorker(highStudentCourse);	(X)
	}
}

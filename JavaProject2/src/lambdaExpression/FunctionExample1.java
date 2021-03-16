package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import hr.EmpDAO;
import hr.Employee;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("신용권", 95, 93));

	public static void printString(Function<Student, String> function) {
		for (Student stduent : list) { // list에 저장된 항목 수만큼 루핑
			System.out.print(function.apply(stduent) + " "); // 람다식 실행
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.print(function.applyAsInt(student) + " "); // 람다식 실행
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString(t -> t.getName());
//		printString(new Function<Student, String>(){	- 람다식으로 줄이기 전의 익명 구현 객체
//			@Override
//			public String apply(Student t) {
//				return t.getName();
//			}
//		});

		System.out.println("[영어 점수]");
//		printInt(t -> t.getEnglishScore());
		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student t) {
				return t.getEnglishScore();
			}
		});

		System.out.println("[수학 점수]");
//		printInt(t -> t.getMathScore());
		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student t) {
				return t.getMathScore();
			}
		});

		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		Stream<Employee> stream = list.stream();
		stream.mapToInt((value) -> value.getSalary())//
				.filter((value) -> value > 5000)//
				.forEach((t) -> // forEach : 스트림의 각각의 요소에 대해 반복적으로 작업을 함
				System.out.println("Salary: " + t));
	}	// 기능을 받아와서 작업을 하는 것

	public static int sum(int a, int b) {
		return a + b;	// 매개값을 받는 메소드
	}
	
	public static int getMaxValue(int[] intAry) {
		return 0;		// 어떤 값을 활용해서 처리함
	}
}

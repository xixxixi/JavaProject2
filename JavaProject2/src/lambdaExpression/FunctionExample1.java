package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(new Student("ȫ�浿", 90, 96), new Student("�ſ��", 95, 93));

	public static void printString(Function<Student, String> function) {
		for (Student stduent : list) { // list�� ����� �׸� ����ŭ ����
			System.out.print(function.apply(stduent) + " "); // ���ٽ� ����
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.print(function.applyAsInt(student) + " "); // ���ٽ� ����
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		printString(t -> t.getName());
//		printString(new Function<Student, String>(){	- ���ٽ����� ���̱� ���� �͸� ���� ��ü
//			@Override
//			public String apply(Student t) {
//				return t.getName();
//			}
//		});

		System.out.println("[���� ����]");
//		printInt(t -> t.getEnglishScore());
		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student t) {
				return t.getEnglishScore();
			}
		});

		System.out.println("[���� ����]");
//		printInt(t -> t.getMathScore());
		printInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student t) {
				return t.getMathScore();
			}
		});
	}
}

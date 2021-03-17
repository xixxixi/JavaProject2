package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortExample {
	public static void main(String[] args) {
		int[] intAry = { 5, 4, 3, 2, 1 };
		IntStream is = Arrays.stream(intAry);
		is.sorted().forEach(number -> System.out.println(number));

		Student[] stdAry = { new Student("ȫ�浿", 10), //
				new Student("�ſ��", 20), //
				new Student("���̼�", 30) };
		Stream<Student> st = Arrays.stream(stdAry);
		st.sorted().forEach(s-> System.out.println(s.getName()));
		
		// ȫ�浿, 10 - �ſ�� 20 = ���� ��
		// ���̼�, 15 - �ſ�� 20 = ���� ��

	}

}

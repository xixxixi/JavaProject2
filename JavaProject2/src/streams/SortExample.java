package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortExample {
	public static void main(String[] args) {
		int[] intAry = { 5, 4, 3, 2, 1 };
		IntStream is = Arrays.stream(intAry);
		is.sorted().forEach(number -> System.out.println(number));

		Student[] stdAry = { new Student("홍길동", 10), //
				new Student("신용권", 20), //
				new Student("유미선", 30) };
		Stream<Student> st = Arrays.stream(stdAry);
		st.sorted().forEach(s-> System.out.println(s.getName()));
		
		// 홍길동, 10 - 신용권 20 = 양의 값
		// 유미선, 15 - 신용권 20 = 음의 값

	}

}

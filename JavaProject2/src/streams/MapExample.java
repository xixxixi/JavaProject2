package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(//
				new Student("홍길동", 10), //
				new Student("신용권", 20), //
				new Student("유미선", 30));

		studentList.stream()// Stream<Student>
				.mapToInt(new ToIntFunction<Student>() {
					@Override
					public int applyAsInt(Student s) {
						System.out.println(s.getName());
						return s.getScore();
					}
				}) // IntStream != Stream<Integer>
				.forEach(new IntConsumer() {
					@Override
					public void accept(int value) {
						System.out.println(value);
					}
				});
		
		studentList.stream()// Stream<Student>
				.mapToInt(s -> s.getScore()) // IntStream != Stream<Integer>
				.forEach((s) -> System.out.println(s));
		
		int[] intAry = {};	// 정수타입
		Integer[] integerAry = {};	// Integer 클래스
		
		IntStream is = Arrays.stream(intAry);
		Stream<Integer> iss = Arrays.stream(integerAry);
		
	}

}

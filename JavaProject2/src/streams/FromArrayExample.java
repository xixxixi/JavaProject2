package streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArray = { "홍길동", "신용권", "김미나" };
		Stream<String> strStream = Arrays.stream(strArray); // Stream<T> 제네릭 타입
		strStream.forEach(a -> System.out.print(a + ",")); // consumer 타입을 가져옴
		System.out.println();

		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray); // = IntStream.of(intArray)도 가능
//		intStream.forEach(a -> System.out.print(a + ","));
		System.out.println();

		int sum = 0;
//		sum = intStream.filter(value -> value % 2 == 0).sum();
		System.out.println("합계는: " + sum);
		
		OptionalDouble od = intStream.filter(value -> value % 2 == 0).average();
		System.out.println("평균: " + od.getAsDouble());

		sum = 0;
		for (int a : intArray) { // for 반복문 사용 예시
			if (a % 2 == 0)
				sum += a;
		}
		System.out.println("합계는: " + sum);
	}
}
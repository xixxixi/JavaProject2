package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class AsDoubleAndBoxedExample {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };

		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream().forEach(d -> System.out.println(d));

		System.out.println();

		intStream = Arrays.stream(intArray);
		intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));

		intStream // IntStream
				.forEach(new IntConsumer() {
					@Override
					public void accept(int value) {
					}
				});

		intStream.boxed() // Stream<T>
				.forEach(new Consumer<Integer>() {
					@Override
					public void accept(Integer t) {
					}

				});

	}
}
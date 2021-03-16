package streams;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(15, 35);
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
		
		int from = 15, to = 35;	// .sum(); 이용
		stream = IntStream.rangeClosed(from, to);
		System.out.println(from + " ~ " + to + " 까지 합:" + stream.sum());

	}

}

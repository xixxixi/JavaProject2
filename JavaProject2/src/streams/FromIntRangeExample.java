package streams;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(15, 35);
		stream.forEach(a -> sum += a);
		System.out.println("����: " + sum);
		
		int from = 15, to = 35;	// .sum(); �̿�
		stream = IntStream.rangeClosed(from, to);
		System.out.println(from + " ~ " + to + " ���� ��:" + stream.sum());

	}

}

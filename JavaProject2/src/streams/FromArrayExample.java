package streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArray = { "ȫ�浿", "�ſ��", "��̳�" };
		Stream<String> strStream = Arrays.stream(strArray); // Stream<T> ���׸� Ÿ��
		strStream.forEach(a -> System.out.print(a + ",")); // consumer Ÿ���� ������
		System.out.println();

		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray); // = IntStream.of(intArray)�� ����
//		intStream.forEach(a -> System.out.print(a + ","));
		System.out.println();

		int sum = 0;
//		sum = intStream.filter(value -> value % 2 == 0).sum();
		System.out.println("�հ��: " + sum);
		
		OptionalDouble od = intStream.filter(value -> value % 2 == 0).average();
		System.out.println("���: " + od.getAsDouble());

		sum = 0;
		for (int a : intArray) { // for �ݺ��� ��� ����
			if (a % 2 == 0)
				sum += a;
		}
		System.out.println("�հ��: " + sum);
	}
}
package streams;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class ReductionExample {
	public static void main(String[] args) {
		Student[] students = { new Student("ȫ�浿", 10), new Student("�ſ��", 20), new Student("���ڹ�", 30) };

		int sum = Arrays.stream(students)// Stream<Student>
				.map(new Function<Student, Integer>() {
					@Override
					public Integer apply(Student t) {
						return t.getScore();
					}
				}).reduce(0, new BinaryOperator<Integer>() {
					@Override
					public Integer apply(Integer t, Integer u) {
						System.out.println("����: " + t + ", ������: " + u);
						return t > u ? t : u;
					}
				});
		System.out.println("sum: " + sum);
	}
}
// cnt++;
// sum+= u;
// return sum/cnt;
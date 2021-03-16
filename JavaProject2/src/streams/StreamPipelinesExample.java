package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(//
				new Member("ȫ�浿", Member.MALE, 30), //
				new Member("�質��", Member.FEMALE, 20), //
				new Member("�ſ��", Member.MALE, 45), //
				new Member("�ڼ���", Member.FEMALE, 27)//
		);

		double ageAvg = list.stream()// Stream<Member> ���� Ÿ��
				.filter(m -> m.getSex() == Member.MALE)// ���� ��Ҹ� ��Ʈ��
				.mapToInt(Member::getAge)// ���� ��Ҹ� ��Ʈ��
				.average()// ��� ��Ʈ��
				.getAsDouble();
		System.out.println("���� ��� ����: " + ageAvg);

		OptionalDouble result = list.stream() // Stream<Member>
				.filter(new Predicate<Member>() {
					@Override
					public boolean test(Member t) {
						return t.getSex() == Member.MALE;
					}
				}) // Stream<Member>
				.mapToInt(new ToIntFunction<Member>() {
					@Override
					public int applyAsInt(Member t) {
						return t.getAge(); // ���� ��Ҹ� ����
					}
				}) // IntStream - int Ÿ������ ����
				.average() // OptionalDouble - double Ÿ���� Ŭ���� : ���� ó�� �޼ҵ�
		;
		System.out.println("���: " + result.getAsDouble()); // getAsDouble - double Ÿ������ ���� ������

		// �÷��� -> ��Ʈ�� -> ����(����) -> ����(30�� �̻�) -> ��� ���� ���غ�����

		result = list.stream() // Stream<Member>
				.mapToInt(new ToIntFunction<Member>() {
					@Override
					public int applyAsInt(Member a) {
						return a.getAge(); // ���� ��� ����
					}
				}).filter(new IntPredicate() {
					@Override
					public boolean test(int v) {
						return v >= 60; // 30�� �̻� ����
					}
				}).average(); // OptionalDouble - double Ÿ���� Ŭ���� : ���� ó�� �޼ҵ�
		System.out.println(result.orElse(0.0)); // ���� ���� �� ����Ʈ�� 0.0�� ���

		if (result.isPresent()) { // isPresent : ���������� ������ ���� �� ��ü�� �����ϴ��� ���θ� �Ǻ�
			System.out.println("���: " + result.getAsDouble());
		} else {
			System.out.println("�����ϴ� ��Ұ� �����ϴ�.");
		}

		result = list.stream().mapToInt(a -> a.getAge()).filter(v -> v >= 30).average();
		System.out.println("���� 30�� �̻��� ���: " + result.getAsDouble());
	}
}

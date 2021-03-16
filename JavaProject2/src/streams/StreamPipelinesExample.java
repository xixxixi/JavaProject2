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
				new Member("홍길동", Member.MALE, 30), //
				new Member("김나리", Member.FEMALE, 20), //
				new Member("신용권", Member.MALE, 45), //
				new Member("박수미", Member.FEMALE, 27)//
		);

		double ageAvg = list.stream()// Stream<Member> 리턴 타입
				.filter(m -> m.getSex() == Member.MALE)// 남자 요소를 스트림
				.mapToInt(Member::getAge)// 나이 요소를 스트림
				.average()// 평균 스트림
				.getAsDouble();
		System.out.println("남자 평균 나이: " + ageAvg);

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
						return t.getAge(); // 나이 요소만 매핑
					}
				}) // IntStream - int 타입으로 리턴
				.average() // OptionalDouble - double 타입의 클래스 : 최종 처리 메소드
		;
		System.out.println("평균: " + result.getAsDouble()); // getAsDouble - double 타입으로 값을 가져옴

		// 컬렉션 -> 스트림 -> 매핑(나이) -> 필터(30세 이상) -> 평균 나이 구해보세요

		result = list.stream() // Stream<Member>
				.mapToInt(new ToIntFunction<Member>() {
					@Override
					public int applyAsInt(Member a) {
						return a.getAge(); // 나이 요소 매핑
					}
				}).filter(new IntPredicate() {
					@Override
					public boolean test(int v) {
						return v >= 60; // 30세 이상 필터
					}
				}).average(); // OptionalDouble - double 타입의 클래스 : 최종 처리 메소드
		System.out.println(result.orElse(0.0)); // 값이 없을 때 디폴트로 0.0을 출력

		if (result.isPresent()) { // isPresent : 최종적으로 연산을 끝낸 후 객체가 존재하는지 여부를 판별
			System.out.println("평균: " + result.getAsDouble());
		} else {
			System.out.println("만족하는 요소가 없습니다.");
		}

		result = list.stream().mapToInt(a -> a.getAge()).filter(v -> v >= 30).average();
		System.out.println("람다 30세 이상의 평균: " + result.getAsDouble());
	}
}

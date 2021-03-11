package generics;

public class Utils {
	public <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setBox(t);
		return null;
	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) { // 페어 클래스의 인스턴스
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}

	public static <T extends Number> int compare(T t1, T t2) { // 제네릭 타입이라 compare 메소드 중복 사용 가능

		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);	// 첫번째 매개값이 작으면 -1, 같으면 0, 크면 1을 리턴

	}
}

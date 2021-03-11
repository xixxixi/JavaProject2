package generics;

public class Utils {
	public <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setBox(t);
		return null;
	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) { // ��� Ŭ������ �ν��Ͻ�
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}

	public static <T extends Number> int compare(T t1, T t2) { // ���׸� Ÿ���̶� compare �޼ҵ� �ߺ� ��� ����

		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);	// ù��° �Ű����� ������ -1, ������ 0, ũ�� 1�� ����

	}
}

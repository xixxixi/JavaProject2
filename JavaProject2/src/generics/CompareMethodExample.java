package generics;

public class CompareMethodExample {
	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");
		boolean resutl1 = Utils.<Integer, String>compare(p1, p2);
		if (resutl1) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}

		Pair<String, String> p3 = new Pair<String, String>("user1", "ȫ�浿");
		Pair<String, String> p4 = new Pair<String, String>("user2", "ȫ�浿");
		boolean result2 = Utils.compare(p3, p4);
		if (result2) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
	}

}

package api;

public class MemberExample {
	public static void main(String[] args) {
		// ���� ��ü ����
		Member original = new Member("blue", "ȫ�浿", "12345", 25, true);

		// ���� ��ü�� ���� �Ŀ� �н����� ����
		Member cloned = original.getMember();
		cloned.password = "67890";

		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);

		System.out.println();

		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age: " + original.age);
		System.out.println("adult: " + original.adult);
	}

//		Member obj1 = new Member("blue");
//		Member obj2 = new Member("blue");
//		Member obj3 = new Member("red");
//
//		if (obj1.equals(obj2)) {
//			System.out.println("obj1�� obj2�� �����մϴ�.");
//		} else {
//			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
//		}
//		if (obj1.equals(obj3)) {
//			System.out.println("obj1�� obj3�� �����մϴ�.");
//		} else {
//			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
//		}
//	}

}

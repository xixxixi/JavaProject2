package objects2;

public class MemberE {

	String name;
	String id;
	String password;
	int age;

	MemberE(String name, String id) {
		this.name = name;
		this.id = id;

	}
}

class MemberEx {
	public static void main(String[] args) {
		MemberE user1 = new MemberE("ȫ�浿", "hong");
		MemberE user2 = new MemberE("���ڹ�", "java");

	}

}
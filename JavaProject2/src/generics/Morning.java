package generics;

public class Morning {
	public static void main(String[] args) {
		System.out.println(checkGender("9603271000000"));
		System.out.println(checkGender("960327-2000000"));

		// �� ���� ���� ���ϰ� ���� ����� 3�ڸ� ������ �����ִ� �޼ҵ�
		sum("10000", "23400");
	}

	public static void sum(String a, String b) {
		
		int result = (Integer.valueOf(a)+Integer.valueOf(b));
		String str = String.format("%,d", result);
//		System.out.println(str);
	}

	public static String checkGender(String j) {

		String[] rep = { "/", "-", "*", "=" };
		String r = j;
		for (String str : rep) {
			r = r.replace(str, "");
		}

		if (r.charAt(6) == '1' || r.charAt(6) == '3') {
			return "����";
		} else if (r.charAt(6) == '2' || r.charAt(6) == '4') {
			return "����";
		}

		return j;
	}

}

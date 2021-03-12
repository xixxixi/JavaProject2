package generics;

public class Morning {
	public static void main(String[] args) {
		System.out.println(checkGender("9603271000000"));
		System.out.println(checkGender("960327-2000000"));

		// 두 수의 합을 구하고 합의 결과를 3자리 단위로 보여주는 메소드
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
			return "남자";
		} else if (r.charAt(6) == '2' || r.charAt(6) == '4') {
			return "여자";
		}

		return j;
	}

}

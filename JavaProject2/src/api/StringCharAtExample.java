package api;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-2230123";
		char sex = ssn.charAt(7);	// 7인덱스 위치에 있는 문자를 읽음(0부터 시작)
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}
	}

}

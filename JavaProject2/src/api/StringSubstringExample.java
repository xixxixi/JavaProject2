package api;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);	// �ε��� 0 ���� 6 ���� ������ ���ڿ��� ����
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	// �ε��� 7������ ���ڿ��� ����
		System.out.println(secondNum);
	}

}

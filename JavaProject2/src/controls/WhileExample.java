package controls;

public class WhileExample {

	public static void main(String[] args) {
		// �ݺ���
		// for(int i=10; i<=9; i++){.....}
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("1 ~ 10 ��: " + sum);
		i = 1;
		sum = 0;
		while (true) {
			sum = sum + i;
			i++;
			if (i >= 10) {
				break;
			}
		}
		System.out.println("1 ~ 10 ��: " + sum);
		// 1 ~ 10 ���� ��:
//		int i = 0;
//		while (true) {
//			if (i++ >= 5)
//				break;

	}

}

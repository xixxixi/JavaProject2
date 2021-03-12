package threads;

public class MainThredExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();	// User1 ������ ����
		user1.setCalculator(calculator);	// ���� ��ü ����
		user1.start();	// User1 ������ ����
		
		User2 user2 = new User2();	// User2 ������ ����
		user2.setCalculator(calculator);	// ���� ��ü ����
		user2.start();	// User2 ������ ����
	}

}
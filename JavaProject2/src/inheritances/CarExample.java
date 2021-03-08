package inheritances;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 7; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire ��ü");
				car.frontLeft = new HankookTire("�տ���", 10);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire ��ü");
				car.frontRight = new KumhoTire("�տ�����", 12);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire ��ü");
				car.backLeft = new HankookTire("�ڿ���", 15);
				break;
			case 4:
				System.out.println("�ڿ����� KumhoTire ��ü");
				car.backRight = new KumhoTire("�ڿ�����", 20);
				break;
			}
			System.out.println("======================================");
		} // end of for
		System.out.println("���α׷� ����");
	} // end of main
} // end of class

package inheritances;

public class Car {
	Tire frontLeft = new Tire("�տ���", 6);
	Tire frontRight = new Tire("�տ�����", 5);
	Tire backLeft = new Tire("�ڿ���", 3);
	Tire backRight = new Tire("�ڿ�����", 7);

	public int run() {
		if (frontLeft.roll() == false) {
			// �޼���
			stop();
			return 1;
		}
		if (frontRight.roll() == false) {
			stop();
			return 2;
		}
		if (backLeft.roll() == false) {
			stop();
			return 3;
		}
		if (backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	public void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}

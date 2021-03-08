package inheritances;

public class Tire {
	int maxRotation; // �ִ�ȸ����
	int accumulatedRotation; // ����ȸ����
	String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ����:" + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}
}

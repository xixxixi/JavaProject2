package inheritances;

public class CellPhoneEx2 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
//		cp = (CellPhone) new DmbPhone();	// int = byte;
//		cp = (CellPhone) new SmartPhone();	// �θ� Ŭ������ �ڽ� Ŭ������ �ν��Ͻ��� ���� �� ����
		cp.color = ""; // �ν��Ͻ��� ���� ���� ������ ȣ���� �Ұ���

		if (cp instanceof DmbPhone) {
			DmbPhone dp = (DmbPhone) cp; // �ڽ��� �θ� ���� �� ���� ���� ��ȯ �ʿ�.
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
		}else {
			System.out.println("Casting �� �� �����ϴ�.");
		}
		
		// ������. = ȣ�Ⱚ�� ������ ����ִ� �ν��Ͻ��� ���� ����Ǵ� ����� �޸���
		// �θ� = �ڽĵ��� ��� �� ����
		// �θ�.�޼ҵ� = �ڽ�.�޼ҵ� ȣ�� ����
		cp = new DmbPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();
	}

}

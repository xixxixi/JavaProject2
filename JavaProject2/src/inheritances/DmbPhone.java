package inheritances;

public class DmbPhone extends CellPhone {	// extends = ��ӹ��� �θ��� Ŭ������ �Է�
	// �ʵ�
	int channel;
	// ������
	
	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��: "+ channel + " ����� �����մϴ�.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("ä��: " + channel + "�� �����մϴ�.");
	}
	void turnOffdmb() {
		System.out.println("����� �����մϴ�.");
	}
	@Override
	void powerOn() {
		super.powerOn();
		System.out.println("DmbPhone ������ �մϴ�.");
	}
	@Override
	void powerOff() {
		super.powerOff();
		System.out.println("DmbPhone ������ ���ϴ�.");
	}
	void bell() {
		System.out.println("DmbPhone ���� �︳�ϴ�.");
	}
	@Override
	public String toString() {
		return "DmbPhone => model : " + model + " color : " + color + " Channel : " + channel;
	}
	

}

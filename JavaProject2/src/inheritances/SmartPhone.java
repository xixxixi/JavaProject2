package inheritances;

public class SmartPhone extends DmbPhone{
	@Override
	void powerOn() {
		super.powerOn();
		System.out.println("SmartPhone ������ �մϴ�.");
	}
	@Override
	void powerOff() {
		super.powerOff();
		System.out.println("SmartPhone ������ ���ϴ�.");
	}
	
}

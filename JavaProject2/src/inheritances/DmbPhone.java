package inheritances;

public class DmbPhone extends CellPhone {	// extends = 상속받을 부모의 클래스를 입력
	// 필드
	int channel;
	// 생성자
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널: "+ channel + " 방송을 수신합니다.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "로 번경합니다.");
	}
	void turnOffdmb() {
		System.out.println("방송을 종료합니다.");
	}
	@Override
	void powerOn() {
		super.powerOn();
		System.out.println("DmbPhone 전원을 켭니다.");
	}
	@Override
	void powerOff() {
		super.powerOff();
		System.out.println("DmbPhone 전원을 끕니다.");
	}
	void bell() {
		System.out.println("DmbPhone 벨이 울립니다.");
	}
	@Override
	public String toString() {
		return "DmbPhone => model : " + model + " color : " + color + " Channel : " + channel;
	}
	

}

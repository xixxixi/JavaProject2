package interfaces;

public interface RemoteControl {
	static final int MAX_VOLUME = 10; // 상수 <-> 변수
	static final int MIN_VOLUME = 0; // 상수 <-> 변수
	
	void turnOn(); // 추상메소드(구현X)
	void turnOff();
	void setVolume(int volume);

}

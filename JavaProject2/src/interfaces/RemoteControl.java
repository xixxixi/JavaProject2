package interfaces;

public interface RemoteControl {
	static final int MAX_VOLUME = 10; // ��� <-> ����
	static final int MIN_VOLUME = 0; // ��� <-> ����
	
	void turnOn(); // �߻�޼ҵ�(����X)
	void turnOff();
	void setVolume(int volume);

}

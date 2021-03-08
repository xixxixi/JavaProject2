package interfaces;

public class RemotecontrolExe {
	public static void main(String[] args) {
		RemoteControl rc = new Television();

		rc.turnOn();
		rc.setVolume(15);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		rc = new RemoteControl() {
			int volume;

			@Override
			public void turnOn() {
				System.out.println("DVD�� �մϴ�");

			}

			@Override
			public void turnOff() {
				System.out.println("DVD�� ���ϴ�.");

			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("DVD���� " + volume);

			} // �͸�����ü

		};
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
	}

}

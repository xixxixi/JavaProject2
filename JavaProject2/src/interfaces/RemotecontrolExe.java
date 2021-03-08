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
				System.out.println("DVD¸¦ ÄÕ´Ï´Ù");

			}

			@Override
			public void turnOff() {
				System.out.println("DVD¸¦ ²ü´Ï´Ù.");

			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("DVDº¼·ý " + volume);

			} // ÀÍ¸í±¸Çö°´Ã¼

		};
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
	}

}

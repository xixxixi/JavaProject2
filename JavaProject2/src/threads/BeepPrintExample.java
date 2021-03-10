package threads;

import java.awt.Toolkit;

class WorkerThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); // 0.5초
			} catch (Exception e) {
			}
		}
	}

}

class NewThread implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); // 0.5초
			} catch (Exception e) {
			}
		}

	}

}

public class BeepPrintExample {
	public static void main(String[] args) {

		// Thread 상속받아서 새로운 WorkerThread 클래스생성 후 인스턴스 생성
//		Thread thread = new WorkerThread();
//		thread.start();

		// Runnable I/F 구현하는 클래스를 Thread(new Runnable())의 생성자 매개값
//		Thread thread = new Thread(new NewThread());
//		thread.start();

		// Runnable I/F 구현하는 익명클래스를 생성 ** 추천하는 방식 ** 스타트 메소드를 실행해야만 함
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500); // 0.5초
					} catch (Exception e) {
					}
				}
			}
		});
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}

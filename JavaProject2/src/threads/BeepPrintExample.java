package threads;

import java.awt.Toolkit;

class WorkerThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); // 0.5��
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
				Thread.sleep(500); // 0.5��
			} catch (Exception e) {
			}
		}

	}

}

public class BeepPrintExample {
	public static void main(String[] args) {

		// Thread ��ӹ޾Ƽ� ���ο� WorkerThread Ŭ�������� �� �ν��Ͻ� ����
//		Thread thread = new WorkerThread();
//		thread.start();

		// Runnable I/F �����ϴ� Ŭ������ Thread(new Runnable())�� ������ �Ű���
//		Thread thread = new Thread(new NewThread());
//		thread.start();

		// Runnable I/F �����ϴ� �͸�Ŭ������ ���� ** ��õ�ϴ� ��� ** ��ŸƮ �޼ҵ带 �����ؾ߸� ��
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500); // 0.5��
					} catch (Exception e) {
					}
				}
			}
		});
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}

package threads;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {	// ���� �޸� ���� �����ϴ� �޼ҵ�
		this.memory = memory;	// �Ű����� memory �ʵ忡 ����
		try {	// �����带 2�ʰ� �Ͻ� ������Ŵ
			Thread.sleep(2000);

		} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}



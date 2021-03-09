package api;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// ���ù�ȣ
		int[] selectNumber = new int[6];	// ���� ��ȣ 6���� ����� �迭 ����
		Random random = new Random();		// ���� ��ȣ�� ��� ���� Random ��ü ����
		System.out.print("���� ��ȣ: ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) +1;	// ���� ��ȣ�� ��� �迭�� ����
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// ��÷��ȣ
		int[] winningNumber = new int[6];	// ��÷ ��ȣ 6���� ����� �迭 ����
		random = new Random();				// ��÷ ��ȣ�� ��� ���� Random ��ü ����
		System.out.print("��÷ ��ȣ: ");
		for (int i = 0; i <6; i++) {
			winningNumber[i]=random.nextInt(45)+1;		// ��÷ ��ȣ�� ��� �迭�� ����
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		// ��÷����
		Arrays.sort(selectNumber);	// ���ϱ� ����
		Arrays.sort(winningNumber);	// ���� ��Ŵ
		boolean result = Arrays.equals(selectNumber, winningNumber);	// �迭 �׸� �� ��
		System.out.print("��÷ ����: ");
		if(result) {
			System.out.print("1� ��÷�Ǽ̽��ϴ�.");
		} else {
			System.out.print("��÷���� �ʾҽ��ϴ�.");
		}
		
	}
	

}

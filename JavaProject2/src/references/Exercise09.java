package references;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.println("����> ");

			int selectNo = scanner.nextInt();
			
			if(selectNo != 1 && scores == null) {
				System.out.println("�л����� �Է��ϼ���..");
				System.out.println();
				continue;
			}

			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum=scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i]=scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			} else if (selectNo == 4) {
				int maxValue=0;
				int sum=0;
				double avg=0.0;
				for(int i=0; i<scores.length; i++) {
					sum+=scores[i];
					if (scores[i]>maxValue)
						maxValue=scores[i];
					
				}
				avg=(double)sum/scores.length;
				System.out.println("�ְ� ����: " + maxValue);
				System.out.println("��� ����: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("���α׷� ����");
	}
}
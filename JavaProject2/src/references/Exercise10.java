package references;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] student = null;
		int studentNum = 0;

		while (true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.�л��� 2.�����Է� 3.����Ʈ 4.��ȸ 5.�����ְ��� 6.�հ��ְ� 7. ��������̻� 9.����");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("����> ");

			int menu = scn.nextInt();

			if (menu == 1 && student == new int[studentNum][studentNum]) {
				System.out.println("�̹� �Է��߽��ϴ�.");
				System.out.println();
				continue;
			}

			if (menu == 1) {
				System.out.print("�л���> ");
				studentNum = scn.nextInt();
				student = new int[studentNum][studentNum];
			} else if (menu == 2) {
				for (int i = 0; i < student.length; i++) {
					System.out.print("�л���ȣ>> ");
					student[i][0] = scn.nextInt();
					System.out.print("��������> ");
					student[i][1] = scn.nextInt();
					System.out.print("��������> ");
					student[i][2] = scn.nextInt();
				}
			} else if (menu == 3) {
				for (int i = 0; i < student.length; i++) {
					System.out.println(
							"�л����� - ��ȣ:" + student[i][0] + ", " + "����:" + student[i][1] + ", " + "����:" + student[i][2]);
				}
			} else if (menu == 4) {
				System.out.print("ã���� �ϴ� �л���ȣ �Է�> ");
				int i = 0;
				student[i][0] = scn.nextInt();
				System.out.println("�л����� - ��ȣ:" + student[i][0] + ", ����:" + student[i][1] + ", ����:" + student[i][2]);
			} else if (menu == 5) {
				int maxValue = 0;
				int sum = 0;
				for (int i = 0; i < student.length; i++) {
					sum += student[i][1];
					if (student[i][1] > maxValue)
						maxValue = student[i][1];
				}
				System.out.println("���� �ְ���: �л���ȣ - " + " - " + "����:" + maxValue);

			} else if (menu == 6) {
				
			} else if (menu == 7) {
			} else if (menu == 9) {
				break;

			}
		}
	}
}

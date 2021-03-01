package references;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] student = null;
		int studentNum = 0;

		while (true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계최고 7. 수학평균이상 9.종료");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("선택> ");

			int menu = scn.nextInt();

			if (menu == 1 && student == new int[studentNum][studentNum]) {
				System.out.println("이미 입력했습니다.");
				System.out.println();
				continue;
			}

			if (menu == 1) {
				System.out.print("학생수> ");
				studentNum = scn.nextInt();
				student = new int[studentNum][studentNum];
			} else if (menu == 2) {
				for (int i = 0; i < student.length; i++) {
					System.out.print("학생번호>> ");
					student[i][0] = scn.nextInt();
					System.out.print("영어점수> ");
					student[i][1] = scn.nextInt();
					System.out.print("수학점수> ");
					student[i][2] = scn.nextInt();
				}
			} else if (menu == 3) {
				for (int i = 0; i < student.length; i++) {
					System.out.println(
							"학생정보 - 번호:" + student[i][0] + ", " + "영어:" + student[i][1] + ", " + "수학:" + student[i][2]);
				}
			} else if (menu == 4) {
				System.out.print("찾고자 하는 학생번호 입력> ");
				int i = 0;
				student[i][0] = scn.nextInt();
				System.out.println("학생정보 - 번호:" + student[i][0] + ", 영어:" + student[i][1] + ", 수학:" + student[i][2]);
			} else if (menu == 5) {
				int maxValue = 0;
				int sum = 0;
				for (int i = 0; i < student.length; i++) {
					sum += student[i][1];
					if (student[i][1] > maxValue)
						maxValue = student[i][1];
				}
				System.out.println("영어 최고점: 학생번호 - " + " - " + "영어:" + maxValue);

			} else if (menu == 6) {
				
			} else if (menu == 7) {
			} else if (menu == 9) {
				break;

			}
		}
	}
}

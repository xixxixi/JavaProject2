package homework;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		int com[] = { 3, 5, 7 };
		int user[] = new int[3];
		int other = 0;
		int counter = 0;
		Scanner scn = new Scanner(System.in);

		boolean baseball = true;

		System.out.println("시작");
		while (baseball) {
			int strike = 0;
			int ball = 0;
			for (int i = 0; i < 3; i++) {
				System.out.print("숫자를 입력하세요: ");
				user[i] = scn.nextInt();
			}
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j] && i == j) {
						strike++;
					} else if (com[i] == user[j] && i != j) {
						ball++;
					}
				}
			}
			System.out.println(strike + " 스트라이크, " + ball + " 볼");
			if (strike == 3) {
				baseball = false;
			}
			counter++;
		}
		System.out.println("횟수: " + counter);
	}
}

package controls;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// System.in.read();
		// Scanner.readLine();
		Scanner scn = new Scanner(System.in);
		System.out.println("값을 입력.");
		String str = scn.nextLine(); // scn.nextInt(); - 숫자값일 경우
		System.out.println("입력한 값은: " + str);
		boolean run = true;
		do {
			System.out.println(">");
			str = scn.nextLine();
			System.out.println(">>> " + str);
//			if(str.equals("q")) {
//				run = false; - break; 를 쓸 경우 while에 run
//			}
		} while (!str.equals("q"));

		System.out.println("프로그램 종료.");
	}

}

package controls;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// System.in.read();
		// Scanner.readLine();
		Scanner scn = new Scanner(System.in);
		System.out.println("���� �Է�.");
		String str = scn.nextLine(); // scn.nextInt(); - ���ڰ��� ���
		System.out.println("�Է��� ����: " + str);
		boolean run = true;
		do {
			System.out.println(">");
			str = scn.nextLine();
			System.out.println(">>> " + str);
//			if(str.equals("q")) {
//				run = false; - break; �� �� ��� while�� run
//			}
		} while (!str.equals("q"));

		System.out.println("���α׷� ����.");
	}

}

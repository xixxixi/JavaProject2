package io;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�> ");
		String InputString = scanner.nextLine();
		System.out.println();
		
		System.out.print("���� �Է�> ");
		int inputInt = scanner.nextInt();
		System.out.println();
		
		System.out.print("�Ǽ� �Է�> ");
		double inputDouble = scanner.nextDouble();
		System.out.println();
		
	}

}

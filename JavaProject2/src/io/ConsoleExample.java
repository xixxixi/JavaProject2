package io;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("���̵�: ");
		String id = console.readLine();
		
		System.out.println("�н�����: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);	// char[] �迭�� ���ڷ� ����
		
		System.out.println("---------");
		System.out.println(id);
		System.out.println(strPassword);
	}

}
